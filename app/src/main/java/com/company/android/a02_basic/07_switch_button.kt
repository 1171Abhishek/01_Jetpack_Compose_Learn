package com.company.android.a02_basic

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Switch
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun SwitchFunction() {
    var inputName by remember {
        mutableStateOf("")
    }

    var colorSwitchIs by remember {
        mutableStateOf(false)
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
            OutlinedTextField(
                value = inputName,
                onValueChange = { inputName = it },
                keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done) ,
                colors =OutlinedTextFieldDefaults.colors(focusedContainerColor = if (colorSwitchIs)  Color.Yellow else Color.Unspecified,
                        focusedBorderColor = if (colorSwitchIs) Color.Green else Color.Unspecified
                )
            )

        Switch(checked = colorSwitchIs,
            onCheckedChange = { colorSwitchIs = it })
        }



    }




@Preview(showSystemUi = true)
@Composable
fun PreviewSwitchFunction() {
    SwitchFunction()
}