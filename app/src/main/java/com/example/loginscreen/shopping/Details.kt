package com.example.loginscreen.shopping

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Details() {
    Text(text = "This is a shopping app",fontSize =  36.sp , fontWeight = FontWeight.Bold , color = Color.Magenta,
        modifier = Modifier.fillMaxWidth().wrapContentWidth(align = Alignment.Start).padding(start = 16.dp,
            end = 16.dp
        ))
}