package com.moejehad.walletsample.components

import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.moejehad.walletsample.NavigationBarItems
import com.moejehad.walletsample.ui.theme.Blue

@Composable
fun BottomBar(
    navigationItems: List<NavigationBarItems>
) {

    NavigationBar(
        containerColor = MaterialTheme.colorScheme.background,
        tonalElevation = 10.dp
    ) {
        navigationItems.forEach { item ->
            AddItem(item)
        }
    }

}

@Composable
fun RowScope.AddItem(item: NavigationBarItems) {
    NavigationBarItem(
        alwaysShowLabel = false,
        selected = false,
        modifier = Modifier
            .padding(
                vertical = 10.dp,
                horizontal = 30.dp
            ),
        onClick = { },
        icon = {
            Icon(
                painter = painterResource(id = item.icon),
                contentDescription = item.route,
                tint = Blue,
                modifier = Modifier.size(25.dp)
            )
        }
    )
}
