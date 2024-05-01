package com.company.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.company.android.a01_Intro.ContentScaleFunction
import com.company.android.a01_Intro.ProjectApp
import com.company.android.a02_basic.ActionImgFunction
import com.company.android.a02_basic.ButtonFunction
import com.company.android.a02_basic.DiceRollerApp
import com.company.android.a02_basic.LemonApp
import com.company.android.a02_basic.SwitchFunction
import com.company.android.a02_basic.TextFieldFunction
import com.company.android.a02_basic.TextFieldPractise
import com.company.android.a3.Function_One
import com.company.android.a3.MyApp
import com.company.android.ui.theme.AndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                  MyApp()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Text(text = "Hello Android")
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidTheme {
        Greeting()
    }
}