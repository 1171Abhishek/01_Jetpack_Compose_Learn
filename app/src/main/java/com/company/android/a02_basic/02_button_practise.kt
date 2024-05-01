package com.company.android.a02_basic

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.company.android.R

@Composable
fun DiceRollerApp() {
    var logic by remember {
        mutableIntStateOf(5)
    }

    val imageLocation = when (logic) {
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(imageLocation),
            contentDescription = null
        )
        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { logic = (1..6).random() }, colors = ButtonDefaults.buttonColors(
                containerColor = colorResource(id = R.color.Dice_Color),
                contentColor = Color.Black
            )
        ) {
            Text(text = "Click")
        }
    }
}

@Preview
@Composable
fun PreviewDiceRollerApp() {
    DiceRollerApp()
}