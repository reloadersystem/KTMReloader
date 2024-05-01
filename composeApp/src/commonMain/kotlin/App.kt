import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import kotlinproject.composeapp.generated.resources.Res
import kotlinproject.composeapp.generated.resources.compose_multiplatform
import moe.tlaster.precompose.PreComposeApp
import moe.tlaster.precompose.viewmodel.ViewModel

@OptIn(ExperimentalResourceApi::class)
@Composable
@Preview
fun App() {

    PreComposeApp {

        val colors = getColorsTheme()

        AppTheme {
            Column(modifier = Modifier.fillMaxSize()) {
                Text("Reloader" , color = colors.textColor)
                Text("Welcome  LIMA")


            }
        }
    }
}


