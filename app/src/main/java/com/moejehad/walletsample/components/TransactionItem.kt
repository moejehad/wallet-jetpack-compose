package com.moejehad.walletsample.components

import android.graphics.Color.parseColor
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun TransactionItem() {

    val colors = listOf(
        Color(parseColor("#1976D2")),
        Color(parseColor("#00796B")),
        Color(parseColor("#FFB300")),
        Color(parseColor("#F4511E")),
   )
    val randomColor = remember { mutableStateOf(colors.random()) }

    Box(
        modifier = Modifier.fillMaxWidth(),
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceAround,
        ) {

            Box(
                modifier = Modifier
                    .size(50.dp)
                    .background(
                        color = randomColor.value.copy(alpha = 0.2f),
                        shape = RoundedCornerShape(50.dp)
                    )
            ) {
                Icon(
                    imageVector = Icons.Default.ShoppingCart,
                    contentDescription = null,
                    tint = randomColor.value,
                    modifier = Modifier
                        .size(50.dp)
                        .padding(12.dp)
                )
            }


            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 20.dp)
            ) {
                Text(
                    text = "Shopping",
                    color = Color.Black,
                    style = MaterialTheme.typography.titleLarge,
                )

                Text(
                    text = "06 OCT",
                    color = Color.Black.copy(alpha = 0.7f),
                    style = MaterialTheme.typography.labelSmall,
                )
            }


            Text(
                text = "- $ 200",
                color = Color.Black,
                style = MaterialTheme.typography.titleLarge,
            )

        }
    }

}