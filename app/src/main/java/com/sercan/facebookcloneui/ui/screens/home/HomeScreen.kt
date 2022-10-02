package com.sercan.facebookcloneui.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ChatBubble
import androidx.compose.material.icons.rounded.PhotoAlbum
import androidx.compose.material.icons.rounded.VideoCall
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sercan.facebookcloneui.R
import com.sercan.facebookcloneui.ui.components.AppTabBar
import com.sercan.facebookcloneui.ui.components.TopBar
import com.sercan.facebookcloneui.ui.utils.VerticalDivider

@Composable
fun HomeScreen() {
    Box(
        Modifier
            .background(MaterialTheme.colors.background)
            .fillMaxSize()
    ) {
        LazyColumn {
            item {
                TopBar()
            }
            item {
                AppTabBar()
            }
            item {
                SharePost()
            }
        }
    }
}


@Composable
fun SharePost() {
    var text by remember { mutableStateOf("") }

    Column {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp, vertical = 12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_placeholder),
                contentDescription = ""
            )

            TextField(
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                modifier = Modifier.fillMaxWidth(),
                value = text,
                onValueChange = {
                    text = it
                },
                placeholder = {
                    Text("Share Post")
                },
                keyboardActions = KeyboardActions(onSend = {
                    text = "Send Post"
                }),
                keyboardOptions = KeyboardOptions(imeAction = ImeAction.Send)
            )
        }
        Divider(thickness = Dp.Hairline)
        Row(Modifier.fillMaxWidth()) {
            ActionItem(
                Icons.Rounded.VideoCall,
                "Live",
                modifier = Modifier.weight(1f)
            )
            VerticalDivider(Modifier.height(48.dp), thickness = Dp.Hairline)
            ActionItem(
                Icons.Rounded.PhotoAlbum,
                "Photo",
                modifier = Modifier.weight(1f)
            )
            VerticalDivider(Modifier.height(48.dp), thickness = Dp.Hairline)
            ActionItem(
                Icons.Rounded.ChatBubble,
                "discuss",
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
private fun ActionItem(
    icon: ImageVector,
    text: String,
    modifier: Modifier = Modifier,
) {
    TextButton(
        modifier = modifier,
        onClick = { },
        colors = ButtonDefaults.textButtonColors(contentColor = MaterialTheme.colors.onSurface)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(icon, contentDescription = text)
            Spacer(Modifier.width(8.dp))
            Text(text)
        }
    }
}



