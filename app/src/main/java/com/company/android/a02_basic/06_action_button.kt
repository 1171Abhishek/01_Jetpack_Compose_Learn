package com.company.android.a02_basic

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ActionImgFunction() {
    var inputName by remember {
        mutableStateOf("")
    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        OutlinedTextField(
            value = inputName,
            onValueChange = { inputName = it },
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done)
        )
    }


}

@Preview
@Composable
fun PreviewActionImgFunction() {
    ActionImgFunction()
}