package com.company.android.a3

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.company.android.R
import com.company.android.data.Datasource
import com.company.android.model.Affirmation

@Composable
fun Function_One() {
    Function_Three(affirmationList = Datasource().loadAffirmation())
}

@Composable
fun Function_Two(affirmation: Affirmation) {
    Card {
        Column {
            Image(
                painter = painterResource(id = affirmation.imageResourceId),
                contentDescription = stringResource(id = affirmation.stringResourceId)
            )
            Text(stringResource(id = affirmation.stringResourceId))
        }
    }
}

@Composable
fun Function_Three(affirmationList: List<Affirmation>) {
    LazyColumn {
        items(affirmationList){affirmation ->
            Function_Two(affirmation = affirmation)
        }
    }
}



@Preview
@Composable
private fun PreviewFunction_Two(){
    Function_Two(Affirmation(R.string.str1 , R.drawable.lemon_tree))
}