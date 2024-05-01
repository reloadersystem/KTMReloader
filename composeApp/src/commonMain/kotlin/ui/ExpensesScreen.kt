package ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import getColorsTheme
import kotlinproject.composeapp.generated.resources.Res

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ExpensesScreen() {

    val colors = getColorsTheme()

    LazyColumn(
        modifier = Modifier.padding(horizontal = 16.dp, vertical = 16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {

        stickyHeader {

            Column(modifier = Modifier.background(colors.backGroundColor)) {

                ExpenseTotalHeader(1023.3)
                AllExpensesHeader()
            }

        }
        this.items(emptyList<String>()) {
            //Composables

        }
    }
}

@Composable
fun ExpenseTotalHeader(total: Double) {

    Card(shape = RoundedCornerShape(30), backgroundColor = Color.Black, elevation = 5.dp) {
        Box(
            modifier = Modifier.fillMaxWidth().height(130.dp).padding(16.dp),
            contentAlignment = Alignment.CenterStart
        ) {
            Text(
                text = "$$total",
                fontSize = 30.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.White
            )

            Text(
                modifier = Modifier.align(Alignment.CenterEnd),
                text = "USD",
                color = Color.Gray
            )
        }

    }


}

@Composable
fun AllExpensesHeader() {

    val colors = getColorsTheme()

    Row(
        modifier = Modifier.padding(vertical = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Text(
            modifier = Modifier.weight(1f),
            text = "ALL Expense",
            fontWeight = FontWeight.ExtraBold,
            fontSize = 20.sp,
            color = colors.textColor
        )

        Button(
            shape = RoundedCornerShape(50),
            onClick = {

            },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.LightGray),
            enabled = false
        ) {
            Text(text = "View All")
        }

    }



}