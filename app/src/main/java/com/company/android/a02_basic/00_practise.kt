package com.company.android.a02_basic

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.company.android.ui.theme.AndroidTheme

@Composable
fun PractiseFunction() {
    var name by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = name,
            onValueChange = { name = it } , label = { Text(text = "Enter")},
            colors = TextFieldDefaults.colors(cursorColor =  Color.Red , focusedLabelColor = Color.Red)
        )
        Text(text = name)
    }
}

@Preview(showSystemUi = true)
@Composable
fun PractiseFunctionPreview() {
    AndroidTheme {
        PractiseFunction()
    }
}