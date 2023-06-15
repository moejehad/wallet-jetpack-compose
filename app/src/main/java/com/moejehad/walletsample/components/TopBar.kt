package com.moejehad.walletsample.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.moejehad.walletsample.R
import com.moejehad.walletsample.ui.theme.Black
import com.moejehad.walletsample.ui.theme.Light

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar() {

    TopAppBar(
        modifier = Modifier.fillMaxWidth().padding(10.dp),
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = Light,
            titleContentColor = Black,
            actionIconContentColor = Black
        ),
        title = {
            Text(
                text = "Overview",
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Start
            )
        },
        actions = {
            IconButton(onClick = {}) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_notifications),
                    contentDescription = "Notifications",
                    modifier = Modifier.size(22.dp)
                )
            }
        }
    )

}