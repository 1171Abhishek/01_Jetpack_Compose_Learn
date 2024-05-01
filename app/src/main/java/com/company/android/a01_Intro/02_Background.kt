package com.company.android.a01_Intro

import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.company.android.ui.theme.AndroidTheme

@Composable
fun BackgroundFunction() {
    Surface(color = Color.Gray) {
        Text(text = "Hello Abhishek")
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewBackgroundFunction() {
    AndroidTheme {
       BackgroundFunction()
    }
}