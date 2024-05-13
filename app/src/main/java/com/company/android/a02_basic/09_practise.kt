package com.company.android.a02_basic

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.company.android.R
import okhttp3.internal.immutableListOf


@Composable
fun MyComposable() {
    var nextButton by remember {
        mutableIntStateOf(0)
    }



    val imgList = immutableListOf(
        R.drawable.pexels_hikaique_775201 ,
        R.drawable.pexels_eberhardgross_1366919 ,
        R.drawable.pexels_pixabay_414262,
        R.drawable.pexels_lina_1741205
    )

    Column(modifier = Modifier.fillMaxSize() , horizontalAlignment = Alignment.CenterHorizontally , verticalArrangement = Arrangement.Center) {
        Box(
            modifier = Modifier
                .size(height = 400.dp, width = 280.dp)
                .background(Color.White)
                .shadow(2.dp, shape = MaterialTheme.shapes.extraSmall)
        ) {
        Image(painter = painterResource(imgList[nextButton]),
            contentDescription = null , modifier = Modifier.padding(14.dp))
        }

        Spacer(modifier = Modifier.height(40.dp))
        Row(modifier = Modifier.fillMaxWidth().padding(start = 10.dp , end = 10.dp) , horizontalArrangement = Arrangement.SpaceAround) {
            Button(onClick = { if(nextButton in 1..3) nextButton-- }) {
                Text(text = "Previous")
            }

            Button(onClick = { if(nextButton < 3) nextButton++ }) {
                Text(text = "Next")
            }

        }
    }
}

@Preview(showSystemUi = true)

@Composable
fun MyComposablePreview() {
    MyComposable()
}