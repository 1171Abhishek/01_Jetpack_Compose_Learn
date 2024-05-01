package com.company.android.a01_Intro

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

/*
Alignment vs Arrangement:

It's important to distinguish between arrangement and alignment. Arrangement controls the distribution of space, while alignment defines the positioning of individual elements within their allocated space. You can use both together to achieve the desired layout.
 */


@Composable
fun AlignmentInColumnApp() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
//        horizontalAlignment = Alignment.Start,
//        horizontalAlignment = Alignment.End,
    ) {
        Text(text = "Abhishek", fontSize = 30.sp)
        Text(text = "Abhishek", fontSize = 30.sp)
        Text(text = "Abhishek", fontSize = 30.sp)
        Text(text = "Abhishek", fontSize = 30.sp)
        Text(text = "Abhishek", fontSize = 30.sp)
    }
}

@Composable
fun AlignmentInRowApp() {
    Row(
        modifier = Modifier.fillMaxSize(),
//        verticalAlignment = Alignment.Top
//        verticalAlignment = Alignment.Bottom
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "Abhishek", fontSize = 20.sp)
        Text(text = "Abhishek", fontSize = 20.sp)
        Text(text = "Abhishek", fontSize = 20.sp)

    }
}


@Preview(showSystemUi = true)
@Composable
fun PreviewAlignmentInColumnApp() {
    AlignmentInRowApp()
}