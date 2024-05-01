package com.company.android.a02_basic

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ChangeAppearanceTextField() {
    var num by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = num,
            onValueChange = { num = it },
            label = { Text(text = "Input here") },
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Next  // IME ACTION
            ),
            colors = TextFieldDefaults.colors(unfocusedContainerColor = Color.Green),
            leadingIcon = {
                Icon(
                    painter = painterResource(
                        id = androidx.core.R.drawable.ic_call_answer
                    ), contentDescription = null
                )
            },
            trailingIcon = {
                Icon(
                    painter = painterResource(id = androidx.core.R.drawable.ic_call_decline),
                    contentDescription = null
                )
            }

        )

    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewChangeAppearanceTextField() {
    ChangeAppearanceTextField()
}
