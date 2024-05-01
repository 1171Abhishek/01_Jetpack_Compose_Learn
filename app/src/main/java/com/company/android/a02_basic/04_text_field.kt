package com.company.android.a02_basic

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.company.android.R

@Composable
fun TextFieldFunction() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var name by remember {
            mutableStateOf("")
        }
        TextField(value = name, onValueChange = {name = it})

        // Custom font
        val jersey_regular = FontFamily(
            Font(R.font.jersey_regular, FontWeight.Normal),
        )
        Text(
            text = "Hello I am using custom font",
            fontFamily = jersey_regular
        )

        var age by remember {
            mutableStateOf("")
        }
        OutlinedTextField(value = age, onValueChange = {age = it})
    }

}


@Preview(showSystemUi = true)
@Composable
fun PreviewTextFieldFunction() {
    TextFieldFunction()
}