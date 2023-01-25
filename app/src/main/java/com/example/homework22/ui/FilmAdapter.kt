package com.example.homework22.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework22.R
import com.example.homework22.model.models.FilmData

class FilmAdapter :
    RecyclerView.Adapter<FilmViewHolder>() {
    private val list: MutableList<FilmData> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.rv_item_films, parent, false)
        return FilmViewHolder(view)
    }

    override fun getItemCount(): Int = list.size

    fun setItems(list: List<FilmData>) {
        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {
        holder.onBind(list[position])
    }
}