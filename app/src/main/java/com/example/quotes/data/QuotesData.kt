package com.example.quotes.data

import com.example.quotes.R
import com.example.quotes.model.Quotes

class QuotesData() {
    fun loadQuotes(): List<Quotes> {
        return listOf<Quotes>(
            Quotes(R.drawable.quotefancy_1),
            Quotes(R.drawable.quotefancy_2),
            Quotes(R.drawable.quotefancy_3),
            Quotes(R.drawable.quotefancy_4),
            Quotes(R.drawable.quotefancy_5),
            Quotes(R.drawable.quotefancy_6),
            Quotes(R.drawable.quotefancy_7),
            Quotes(R.drawable.quotefancy_8),
            Quotes(R.drawable.quotefancy_9),
            Quotes(R.drawable.quotefancy_10),
        )
    }
}
