package com.company.android.a01_Intro

import androidx.compose.foundation.layout.Row   // Import this for row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.company.android.ui.theme.AndroidTheme


@Composable
fun RowFunction() {
    Row {
        Text(text = "Abhishek")
        Text(text = "Kumar")
    }
}


@Preview(showSystemUi = true)
@Composable
fun RowFunctionPreview() {
    AndroidTheme {
        RowFunction()
    }
}