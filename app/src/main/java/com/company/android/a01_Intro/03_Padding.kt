package com.company.android.a01_Intro

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.company.android.ui.theme.AndroidTheme


@Composable
fun PaddingFunction() {
    Text(
        text = "Hello Abhishek",
        modifier = Modifier
            .padding(10.dp) // outer padding
            .background(color = Color.Red)
            .padding(10.dp) // inner padding
    )
}

@Preview(/*showSystemUi = true */showBackground = true)
@Composable
fun PreviewPaddingFunction() {
    AndroidTheme {
        PaddingFunction()

    }
}