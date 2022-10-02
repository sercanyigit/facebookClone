package com.sercan.facebookcloneui.ui.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sercan.facebookcloneui.ui.components.TopBar

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
        }
    }
}



