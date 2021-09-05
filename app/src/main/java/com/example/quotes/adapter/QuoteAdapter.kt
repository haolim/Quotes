package com.example.quotes.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.quotes.model.Quotes
import com.example.quotes.databinding.QuoteListBinding

class QuoteAdapter(
    private val context: Context,
    private val image_quote_list: List<Quotes>
) : RecyclerView.Adapter<QuoteAdapter.QuoteViewHolder>() {

    class QuoteViewHolder(
        private val binding: QuoteListBinding
        ) : RecyclerView.ViewHolder(binding.root) {

        val imageView: ImageView = binding.imageQuote
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuoteViewHolder {
        val binding = QuoteListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return QuoteViewHolder(binding)
    }

    override fun onBindViewHolder(holder: QuoteViewHolder, position: Int) {
        val item = image_quote_list[position]
        holder.imageView.setImageResource(item.imageResourceId)
    }

    override fun getItemCount() = image_quote_list.size
}