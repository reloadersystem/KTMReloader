package previes

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import data.ExpenseManager
import model.Expense
import model.ExpenseCategory
import presentacion.ExpensesUiState
import ui.AllExpensesHeader
import ui.ExpenseTotalHeader
import ui.ExpensesItem
import ui.ExpensesScreen

@Preview(showBackground = true)
@Composable
fun ExpensesTotalHeaderPreview() {
    Box(modifier = Modifier.padding(16.dp)) {
        ExpenseTotalHeader(total = 1028.8)
    }
}


@Preview(showBackground = true)
@Composable
fun AllExpensesHeaderPreview() {
    Box(modifier = Modifier.padding(16.dp)) {
        AllExpensesHeader()
    }
}

@Preview(showBackground = true)
@Composable
fun ExpenseItemPreview() {
//    Box(modifier = Modifier.padding(16.dp)) {
//        ExpensesItem(expense = Expense(
//            id = 1L,
//            amount = 70.0,
//            category = ExpenseCategory.PARTY,
//            description = "Fin de Semana"
//        ), onExpenseClick = {}
//        )
//    }

    Box(modifier = Modifier.padding(16.dp)) {
        ExpensesItem(expense = ExpenseManager.fakeExpenseList[2], onExpenseClick = {})
    }
}

@Preview(showBackground = true)
@Composable
fun ExpensesScreenPreview() {
    ExpensesScreen(
        uiState = ExpensesUiState.Success (
        expenses = ExpenseManager.fakeExpenseList,
        total = 1052.2), onExpenseClick = {})
}






