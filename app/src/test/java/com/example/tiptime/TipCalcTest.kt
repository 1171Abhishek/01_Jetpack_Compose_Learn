package com.example.tiptime

import com.company.android.a02_basic.calculateTip
import com.company.android.a02_basic.squareNumbers
import junit.framework.TestCase.assertEquals
import org.junit.Test
import java.text.NumberFormat

class TipCalcTest {
//    @Test
//    fun testFunction(){
//        val amount = 10.00
//        val tipPercent = 20.00
//        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
//        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, false)
//        assertEquals(expectedTip, actualTip)
//    }

    @Test
    fun testFunction1(){
        val n1 = 10
        val n2 = 2
        val f1 = squareNumbers(n1 , n2)
        assertEquals(20 , f1)

    }



}