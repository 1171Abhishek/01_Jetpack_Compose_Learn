package com.company.android.a02_basic

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview


private fun square(x: Double): Double {
    val y = x / 100
//    return /*x.pow(x)*/
    return y
}

@Composable
fun TextFieldPractise() {
    var num by remember {
        mutableStateOf("")
    }
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = num,
            onValueChange = { num = it },
            label = { Text(text = "Input here") },
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )



        Text(text = "Square of $num is ${square(num.toDoubleOrNull() ?: 0.0)}")
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewTextFieldPractise() {
    TextFieldPractise()
}