package com.moejehad.walletsample.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.dp
import com.moejehad.walletsample.ui.theme.Black

@Composable
fun WalletCard() {

    Box(
        modifier = Modifier
            .width(320.dp)
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        MaterialTheme.colorScheme.primary,
                        MaterialTheme.colorScheme.secondary
                    )
                ),
                shape = RoundedCornerShape(20.dp)
            )
            .shadow(
                ambientColor = Black,
                elevation = 20.dp,
                shape = RoundedCornerShape(100.dp)
            )
    ) {
        Box(modifier = Modifier.padding(20.dp)) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.Start
            ) {

                Text(
                    text = "****** 7891",
                    color = MaterialTheme.colorScheme.background,
                    style = MaterialTheme.typography.titleMedium
                )

                Spacer(modifier = Modifier.height(50.dp))

                Text(
                    text = "Balance",
                    color = MaterialTheme.colorScheme.background,
                    style = MaterialTheme.typography.titleMedium
                )

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "$ 5,786.00",
                    color = MaterialTheme.colorScheme.background,
                    style = MaterialTheme.typography.titleLarge
                )

            }
        }
    }
}