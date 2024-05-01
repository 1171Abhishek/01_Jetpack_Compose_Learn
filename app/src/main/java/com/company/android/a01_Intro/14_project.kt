package com.company.android.a01_Intro

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.company.android.ui.theme.AndroidTheme

@Composable
fun ProjectApp() {
    Column(modifier = Modifier.fillMaxSize()) {
        Row(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier
                .fillMaxSize(.5f)
                .background(color = Color.Black), verticalArrangement = Arrangement.Center , horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "Abhishek" , color = Color.White)
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(.5f)
                    .background(color = Color.Yellow), verticalArrangement = Arrangement.Center , horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Abhishek")
            }

        }
        Row() {
            Column(modifier = Modifier
                .fillMaxHeight().fillMaxWidth(.5f)
                .background(color = Color.Cyan), verticalArrangement = Arrangement.Center , horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "Abhishek")
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .background(color = Color.White) , verticalArrangement = Arrangement.Center , horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Abhishek")
            }

        }


    }


}



@Preview(showSystemUi = true)
@Composable
fun PreviewProjectApp() {
    AndroidTheme {
        ProjectApp()
    }
}