package com.company.android.a01_Intro

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp      // Import this for font size
import com.company.android.ui.theme.AndroidTheme

@Composable
fun TextFunction() {
    Text(
        text = "Hello Abhishek",
        fontSize = 80.sp ,   // change font size
        lineHeight = 100.sp
    )
}

@Preview(showSystemUi = true)
@Composable
fun PreviewTextFunction() {
    AndroidTheme {
        TextFunction()
    }
}