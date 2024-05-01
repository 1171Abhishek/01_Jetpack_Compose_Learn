package com.company.android.a01_Intro

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/*
In Jetpack Compose, you can use .align to control the alignment of individual children within a Box,
Row, or Column layout. The .align modifier is useful when you want to specify the alignment of a single
child independently from the alignment of the other children in the parent layout.
 */

@Composable
fun AlignInColumn() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Abhishek", fontSize = 30.sp,
            modifier = Modifier.align(Alignment.Start)
        )
        Text(
            text = "Abhishek", fontSize = 30.sp,
            modifier = Modifier.align(Alignment.End)
        )
        Text(
            text = "Abhishek",
            fontSize = 30.sp,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

    }
}

@Composable
fun AlignInRow() {
    Row(
        modifier = Modifier
            .background(color = Color.Blue)
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Abhishek",
            fontSize = 20.sp,
            modifier = Modifier.align(Alignment.CenterVertically)
        )
        Text(text = "Abhishek", fontSize = 20.sp, modifier = Modifier.align(Alignment.Bottom))
        Text(text = "Abhishek", fontSize = 20.sp, modifier = Modifier.align(Alignment.Top))
    }
}

@Composable
fun BoxAlign() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .size(width = 300.dp, height = 300.dp)
                .background(color = Color.Black, RoundedCornerShape(8))
                .padding(16.dp)
        ) {
            Text(
                text = "1",
                color = Color.White,
                fontSize = 20.sp,
                modifier = Modifier.align(Alignment.TopStart)
            )
            Text(
                text = "1",
                color = Color.White,
                fontSize = 20.sp,
                modifier = Modifier.align(Alignment.TopCenter)
            )
            Text(
                text = "1",
                color = Color.White,
                fontSize = 20.sp,
                modifier = Modifier.align(Alignment.TopEnd)
            )
            Text(
                text = "1",
                color = Color.White,
                fontSize = 20.sp,
                modifier = Modifier.align(Alignment.CenterStart)
            )
            Text(
                text = "1",
                color = Color.White,
                fontSize = 20.sp,
                modifier = Modifier.align(Alignment.Center)
            )
            Text(
                text = "1",
                color = Color.White,
                fontSize = 20.sp,
                modifier = Modifier.align(Alignment.CenterEnd)
            )
            Text(
                text = "1",
                color = Color.White,
                fontSize = 20.sp,
                modifier = Modifier.align(Alignment.BottomStart)
            )
            Text(
                text = "1",
                color = Color.White,
                fontSize = 20.sp,
                modifier = Modifier.align(Alignment.BottomCenter)
            )
            Text(
                text = "1",
                color = Color.White,
                fontSize = 20.sp,
                modifier = Modifier.align(Alignment.BottomEnd)
            )
        }
    }


}

@Preview(showSystemUi = true)
@Composable
fun PreviewAlignFunction() {
    BoxAlign()
}