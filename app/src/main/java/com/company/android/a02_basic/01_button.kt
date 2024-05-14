package com.company.android.a02_basic

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ButtonFunction() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.LightGray,
                contentColor = Color.Red
            )
        ) {
            Text(text = "Click")
        }

        FilledTonalButton(onClick = { /*TODO*/ }) {
            Text(text = "Click")
        }

        OutlinedButton(onClick = { /*TODO*/ }) {
            Text(text = "Click")
        }

        ElevatedButton(onClick = { /*TODO*/ } /*, enabled = false*/) {
            Text(text = "Click")
        }

        TextButton(onClick = { /*TODO*/ }) {
            Text(text = "Click")
        }
        /**
         * Important: Check how many types of buttons are available and then use them accordingly to your needs.
         * To check : Type Button and see suggestion for buttons. And explore all options.
         */
    }

}

@Preview(showSystemUi = true)
@Composable
fun PreviewButtonFunction() {
    ButtonFunction()
}