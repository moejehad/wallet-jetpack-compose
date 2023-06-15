package com.moejehad.walletsample

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.moejehad.walletsample.components.BottomBar
import com.moejehad.walletsample.components.TopBar
import com.moejehad.walletsample.components.TransactionItem
import com.moejehad.walletsample.components.WalletCard
import com.moejehad.walletsample.ui.theme.Light

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {

    val screenList = listOf(
        NavigationBarItems.Home,
        NavigationBarItems.Profile,
        NavigationBarItems.Settings
    )

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = Light,
        topBar = { TopBar() },
        bottomBar = { BottomBar(navigationItems = screenList) },
    ) { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)) {

            Column(
                modifier = Modifier.fillMaxWidth(),
            ) {

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 15.dp)
                        .horizontalScroll(rememberScrollState()),
                ) {
                    Spacer(modifier = Modifier.width(20.dp))
                    repeat(3){
                        WalletCard()
                        Spacer(modifier = Modifier.width(10.dp))
                    }
                    Spacer(modifier = Modifier.width(20.dp))
                }

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            color = MaterialTheme.colorScheme.background,
                            shape = RoundedCornerShape(
                                topEnd = 40.dp,
                                topStart = 40.dp
                            )
                        ),
                ) {

                    Column {

                        Text(
                            text = "Transactions",
                            color = Color.Black,
                            style = MaterialTheme.typography.titleLarge,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(20.dp)
                        )

                        Column(
                            modifier = Modifier
                                .padding(horizontal = 20.dp)
                                .verticalScroll(rememberScrollState()),
                            verticalArrangement = Arrangement.spacedBy(20.dp)
                        ) {
                            repeat(20){
                                TransactionItem()
                            }
                        }
                    }

                }

            }

        }
    }

}