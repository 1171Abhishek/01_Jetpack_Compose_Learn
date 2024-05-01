package com.company.android.a01_Intro

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

//Arrangement - main axis ->
//Alignment - cross axis
/*
Arrangement in Jetpack Compose controls how child elements are positioned within a container layout
 like Row, Column, or Box. It essentially defines the distribution of available space among the
 child elements along the main axis of the container.
 */

/*
Key Points:

Main Axis: This refers to the primary orientation of the container layout. In a Row, it's horizontal,
while in a Column, it's vertical.

Available Space: This is the total space within the container layout after considering paddings and margins.

Child Elements: These are the UI components placed inside the container layout.
 */

/*
Common Arrangement Options:

Start: Positions elements at the beginning of the main axis.
End: Positions elements at the end of the main axis.
Center: Centers elements within the available space along the main axis.
SpaceBetween: Place children such that they are spaced evenly across the main axis, without free space before the first child or after the last child.
SpaceAround: Places equal space around each element, with potentially double space in the middle compared to the ends.
SpaceEvenly: Distributes equal space between all elements, including the start and end of the main axis.
 */


/*
Alignment vs Arrangement:

It's important to distinguish between arrangement and alignment. Arrangement controls the distribution of space, while alignment defines the positioning of individual elements within their allocated space. You can use both together to achieve the desired layout.
 */

@Composable
fun ArrangementInColumnApp() {
    Column(
        modifier = Modifier.fillMaxSize(),
//        verticalArrangement = Arrangement.Center ,
//        verticalArrangement = Arrangement.Top ,
//        verticalArrangement = Arrangement.Bottom ,
//        verticalArrangement = Arrangement.SpaceEvenly,
//        verticalArrangement = Arrangement.SpaceAround,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = "Abhishek", fontSize = 30.sp)
        Text(text = "Abhishek", fontSize = 30.sp)
        Text(text = "Abhishek", fontSize = 30.sp)
        Text(text = "Abhishek", fontSize = 30.sp)
        Text(text = "Abhishek", fontSize = 30.sp)
    }
}

@Composable
fun ArrangementInRowApp() {
    Row(
        modifier = Modifier.fillMaxSize(),
//        horizontalArrangement = Arrangement.Start,
//        horizontalArrangement = Arrangement.Center,
//        horizontalArrangement = Arrangement.End,
//        horizontalArrangement = Arrangement.SpaceEvenly,
//        horizontalArrangement = Arrangement.SpaceBetween,
//        horizontalArrangement = Arrangement.SpaceAround,
//        horizontalArrangement = Arrangement.Absolute.Center,
//        horizontalArrangement = Arrangement.Absolute.Left,
//        horizontalArrangement = Arrangement.Absolute.Right,
//        horizontalArrangement = Arrangement.Absolute.SpaceBetween,
//        horizontalArrangement = Arrangement.Absolute.SpaceAround,
        horizontalArrangement = Arrangement.Absolute.SpaceEvenly,
    ) {
        Text(text = "Abhishek", fontSize = 20.sp)
        Text(text = "Abhishek", fontSize = 20.sp)
        Text(text = "Abhishek", fontSize = 20.sp)
    }
}


@Preview(showSystemUi = true)
@Composable
fun PreviewArrangementInColumnApp() {
    ArrangementInColumnApp()
}