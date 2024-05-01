package com.company.android.a01_Intro

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/*
In Jetpack Compose, textAlign is a property specifically used with the Text
 composable to control the horizontal alignment of the text content within its
 designated area.
 */
@Composable
fun TextAlignFunction() {
    Text(
        text = "Abhishek kumarAbhishek kumarAbhishek kumarAbhishek kumarAbhishek kumarAbhishek kumarAbhishek kumar",
        modifier = Modifier
            .size(height = 60.dp, width = 300.dp)
            .background(color = Color.Cyan),
//        textAlign = TextAlign.Center  // Use TextAlign.Center to center the text within its bounding box.//

//        textAlign = TextAlign.Start   // Use TextAlign.Start to align text based on the start of the text's reading direction (left in LTR, right in RTL).

//        textAlign = TextAlign.End // Use TextAlign.End to align text based on the end of the text's reading direction (right in LTR, left in RTL)
//        .
//        textAlign = TextAlign.Right   // Use TextAlign.Right to align the text to the right within its bounding box.

//        textAlign = TextAlign.Left    // This is the default alignment. You can specify TextAlign.Left explicitly if desired.
        
        textAlign = TextAlign.Justify   // Use TextAlign.Justify to justify the text within its bounding box, ensuring that lines of text fill the width of the container.

    )
}

@Preview(showSystemUi = true)
@Composable
fun PreviewTextAlignFunction() {
    TextAlignFunction()
}