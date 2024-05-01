package com.company.android.a02_basic

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.company.android.R

@Composable
fun LemonApp() {
    var changeLemonImage by remember {
        mutableIntStateOf(1)
    }

    val imageChangeLogicLemon = when (changeLemonImage) {
        1 -> R.drawable.lemon_tree
        2 -> R.drawable.lemon_squeeze
        3 -> R.drawable.lemon_drink
        4 -> R.drawable.lemon_restart
        else -> R.drawable.lemon_squeeze
    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Box {
            Image(
                painter = painterResource(imageChangeLogicLemon),
                contentDescription = null,
                modifier = Modifier.clickable {
                    changeLemonImage =
//                        if (changeLemonImage < 3) changeLemonImage + 1 else 1
                        if (changeLemonImage < 4) {
                            ++changeLemonImage
                        } else {
                            1
                        }
                }
            )
        }
    }


}

@Preview
@Composable
fun PreviewLemonApp() {
    LemonApp()
}