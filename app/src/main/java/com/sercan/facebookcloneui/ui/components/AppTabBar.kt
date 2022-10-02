package com.sercan.facebookcloneui.ui.components

import androidx.compose.foundation.layout.heightIn
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.sercan.facebookcloneui.R
import com.sercan.facebookcloneui.data.models.TabItemModel
import java.util.*

@Composable
fun AppTabBar() {
    var tabIndex by remember { mutableStateOf(0) }

    TabRow(
        selectedTabIndex = tabIndex,
        backgroundColor = Color.Transparent,
        contentColor = MaterialTheme.colors.primary,
    ) {
        val tabs = listOf(
            TabItemModel(icon = Icons.Rounded.Home, stringResource(R.string.home)),
            TabItemModel(icon = Icons.Rounded.Tv, stringResource(R.string.reels)),
            TabItemModel(icon = Icons.Rounded.Store, stringResource(R.string.marketplace)),
            TabItemModel(icon = Icons.Rounded.Newspaper, stringResource(R.string.news)),
            TabItemModel(icon = Icons.Rounded.Notifications, stringResource(R.string.notifications)),
            TabItemModel(icon = Icons.Rounded.Menu, stringResource(R.string.menu)),
        )

        tabs.forEachIndexed { index, item ->
            Tab(
                selected = tabIndex == index,
                onClick = { tabIndex = index },
                modifier = Modifier.heightIn(48.dp)
            ) {
                Icon(
                    item.icon,
                    contentDescription = item.contentDescription,
                    tint = if (index == tabIndex) {
                        MaterialTheme.colors.primary
                    } else {
                        MaterialTheme.colors.onSurface.copy(alpha = 0.44f)
                    }
                )
            }
        }
    }
}