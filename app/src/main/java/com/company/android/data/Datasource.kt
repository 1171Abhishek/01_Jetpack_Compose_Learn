package com.company.android.data

import com.company.android.R
import com.company.android.model.Affirmation

class Datasource {
    fun loadAffirmation(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(stringResourceId = R.string.newStr, R.drawable.lemon_tree),
            Affirmation(stringResourceId = R.string.newStr, R.drawable.lemon_tree),
            Affirmation(stringResourceId = R.string.newStr, R.drawable.lemon_tree),
            Affirmation(stringResourceId = R.string.newStr, R.drawable.lemon_tree),
            Affirmation(stringResourceId = R.string.newStr, R.drawable.lemon_tree),
            Affirmation(stringResourceId = R.string.newStr, R.drawable.lemon_tree)
        )
    }
}