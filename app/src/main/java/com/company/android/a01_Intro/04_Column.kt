package com.company.android.a01_Intro

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.company.android.ui.theme.AndroidTheme


@Composable
fun ColumnFunction() {
    Column {
        Text(text = "Abhishek")
        Text(text = "Kumar")
    }
}


@Preview(showSystemUi = true)
@Composable
fun ColumnFunctionPreview() {
    AndroidTheme {
        ColumnFunction()
    }
}