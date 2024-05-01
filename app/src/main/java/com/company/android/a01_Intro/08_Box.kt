package com.company.android.a01_Intro

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.company.android.ui.theme.AndroidTheme


/*
In Jetpack Compose, a Box is a fundamental layout composable that acts as a
container for your UI elements. It allows you to stack elements on top of each
 other and precisely control their positioning within the Box's area. Here's a
 breakdown of what Box offers:

Container: Similar to a FrameLayout in the traditional Android view system, Box
 serves as a container for your other UI elements like Text, Image, Buttons, etc.

Stacking:  You can add multiple elements as children within a Box, and they'll be
 layered on top of each other in the order they're added.

Positioning:  Box provides options to control the alignment of its child elements.
You can position them at the center, top, bottom, left, right, or any combination of
these.
 */
@Composable
fun BoxFunction() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

//    }
//    Column(
//        verticalArrangement = Arrangement.Center,
//        modifier = Modifier.fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
        Box(
            modifier = Modifier
                .size(300.dp)
                .background(color = Color.Red, RoundedCornerShape(10))
                .padding(20.dp)
        ) {
            Text(
                text = "5",
                fontSize = 30.sp,
                fontWeight = FontWeight.Black,
                modifier = Modifier.align(
                    Alignment.Center
                )
            )
            Text(
                text = "8",
                fontSize = 30.sp,
                fontWeight = FontWeight.Black,
                modifier = Modifier.align(
                    Alignment.BottomCenter
                )
            )
            Text(
                text = "9",
                fontSize = 30.sp,
                fontWeight = FontWeight.Black,
                modifier = Modifier.align(
                    Alignment.BottomEnd
                )
            )
            Text(
                text = "2",
                fontSize = 30.sp,
                fontWeight = FontWeight.Black,
                modifier = Modifier.align(
                    Alignment.TopCenter
                )
            )
            Text(
                text = "1",
                fontSize = 30.sp,
                fontWeight = FontWeight.Black,
                modifier = Modifier.align(
                    Alignment.TopStart
                )
            )
            Text(
                text = "3",
                fontSize = 30.sp,
                fontWeight = FontWeight.Black,
                modifier = Modifier.align(
                    Alignment.TopEnd
                )
            )
            Text(
                text = "6",
                fontSize = 30.sp,
                fontWeight = FontWeight.Black,
                modifier = Modifier.align(
                    Alignment.CenterEnd
                )
            )
            Text(
                text = "4",
                fontSize = 30.sp,
                fontWeight = FontWeight.Black,
                modifier = Modifier.align(
                    Alignment.CenterStart
                )
            )
            Text(
                text = "7",
                fontSize = 30.sp,
                fontWeight = FontWeight.Black,
                modifier = Modifier.align(
                    Alignment.BottomStart
                )
            )


        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun BoxFunctionPreview() {
    AndroidTheme {
        BoxFunction()
    }
}