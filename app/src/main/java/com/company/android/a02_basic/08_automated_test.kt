package com.company.android.a02_basic

import androidx.annotation.VisibleForTesting
import java.text.NumberFormat

/*Testing ensures software works as expected. Automated testing is code that checks if other
code works correctly.*/
//Type of automated tests
/*Local tests
Local tests are a type of automated test that directly test a small piece of code to ensure that
it functions properly. With local tests, you can test functions, classes, and properties.*/
/*
Instrumentation tests
For Android development, instrumentation tests are UI tests that check parts of an app that rely
 on the Android API and platform services.
 */


// any function
@VisibleForTesting // This makes the method public, but indicates to others that it's only public for testing purposes.
internal fun calculateTip(amount: Double, tipPercent: Double = 15.0, roundUp: Boolean): String {
    var tip = tipPercent / 100 * amount
    if (roundUp) {
        tip = kotlin.math.ceil(tip)
    }
    return NumberFormat.getCurrencyInstance().format(tip)
}

@VisibleForTesting
internal fun squareNumbers(x:Int , y :Int):Int{
    return x*y
}

