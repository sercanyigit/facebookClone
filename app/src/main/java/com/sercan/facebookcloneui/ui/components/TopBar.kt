package com.sercan.facebookcloneui.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ChatBubble
import androidx.compose.material.icons.rounded.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.sercan.facebookcloneui.R
import com.sercan.facebookcloneui.ui.theme.ButtonGray

@Composable
fun TopBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp), verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = stringResource(id = R.string.app_name), style = MaterialTheme.typography.h6)
        Spacer(modifier = Modifier.weight(1f))
        IconButton(
            onClick = { }, modifier = Modifier
                .clip(CircleShape)
                .background(color = ButtonGray)
        ) {
            Icon(imageVector = Icons.Rounded.Search, contentDescription = stringResource(id = R.string.search))
        }
        Spacer(modifier = Modifier.width(8.dp))
        IconButton(
            onClick = { }, modifier = Modifier
                .clip(CircleShape)
                .background(ButtonGray)
        ) {
            Icon(imageVector = Icons.Rounded.ChatBubble, contentDescription = stringResource(id = R.string.chat))
        }
    }
}