package com.company.android.a01_Intro

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.company.android.R
import com.company.android.ui.theme.AndroidTheme

@Composable
fun StringResourceFunction() {
    Text(stringResource(id = R.string.newStr))
}

@Preview(showSystemUi = true)
@Composable
fun StringResourceFunctionPreview() {
    AndroidTheme {
        StringResourceFunction()
    }
}