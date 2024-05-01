package com.company.android.a01_Intro

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
import com.company.android.ui.theme.AndroidTheme

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { // The onCreate() function is the entry point to this Android app and calls other functions to build the user interface
        super.onCreate(savedInstanceState)
        setContent {  // The setContent() function within the onCreate() function is used to define your layout through composable functions.
            //  All functions marked with the @Composable annotation can be called from the setContent() function or from other
            AndroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting2("Android")
                }
            }
        }
    }
}


/*Composable functions. The annotation tells the Kotlin compiler that this function is used by Jetpack Compose to generate the UI.
 This Composable function takes some input and generates what's shown on the screen.
You add the @Composable annotation before the function.
@Composable function names are capitalized.
@Composable functions can't return anything.*/
@Composable
fun Greeting2(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}


/*  What is a user interface (UI)?
    The user interface (UI) of an app is what you see on the screen: text, images, buttons, and many other types of elements, and how it's laid out on the screen. It's how the app shows things to the user and how the user interacts with the app.

    Each of these elements is called a UI component.
     Almost everything you see on the screen of your app is a UI element (also known as a UI component)
 */

/*  3. What is Jetpack Compose?
Jetpack Compose is a modern toolkit for building Android UIs
 */

/*  Composable functions
Composable functions are the basic building block of a UI in Compose. A composable function:

Describes some part of your UI.
Doesn't return anything.
Takes some input and generates what's shown on the screen.

 */

/*  Annotations
    Annotations are means of attaching extra information to code. This information helps tools like the Jetpack Compose compiler, and other developers understand the app's code.
 */

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    AndroidTheme {
        Greeting2("Android")
    }
}