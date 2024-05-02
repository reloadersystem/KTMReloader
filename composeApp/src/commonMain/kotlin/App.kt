import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import data.ExpenseManager
import data.ExpenseRepoImpl
import moe.tlaster.precompose.PreComposeApp
import moe.tlaster.precompose.flow.collectAsStateWithLifecycle
import moe.tlaster.precompose.viewmodel.viewModel
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.ui.tooling.preview.Preview
import presentacion.ExpensesViewModel
import ui.ExpensesScreen

@OptIn(ExperimentalResourceApi::class)
@Composable
@Preview
fun App() {

    PreComposeApp {

        val colors = getColorsTheme()

        val viewModel = viewModel(modelClass = ExpensesViewModel::class){
            ExpensesViewModel(ExpenseRepoImpl(ExpenseManager))
        }

        val uiState by viewModel.uiState.collectAsStateWithLifecycle()

        AppTheme {
//            ExpensesScreen(uiState = ExpensesUiState(expenses = ExpenseManager.fakeExpenseList,
//                total = 1052.2), onExpenseClick = {})

            ExpensesScreen(
                uiState = uiState, onExpenseClick = {

                }
            )
        }
    }
}


