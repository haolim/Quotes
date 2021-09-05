package com.example.quotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.quotes.adapter.QuoteAdapter
import com.example.quotes.data.QuotesData
import com.example.quotes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set the data
        val quotes_list = QuotesData().loadQuotes()

        val recyclerView = binding.recyclerView

        // Set the scrolling to horizontal
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = QuoteAdapter(this, quotes_list)

        recyclerView.setHasFixedSize(true)
    }
}