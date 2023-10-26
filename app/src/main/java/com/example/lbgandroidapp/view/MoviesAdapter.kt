package com.example.lbgandroidapp.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.lbgandroidapp.data.model.MovieModel
import com.example.lbgandroidapp.R
import com.example.lbgandroidapp.databinding.ListItemMovieBinding

class MoviesAdapter(private val movies: ArrayList<MovieModel>): RecyclerView.Adapter<MoviesAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: ListItemMovieBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ListItemMovieBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun getItemCount(): Int {
       return movies.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val context = holder.itemView.context
        val title = context.getString(R.string.title_x).replace("X", movies[position].title.toString())
        holder.binding.xTitle.text =  title
        holder.binding.xYear.text = context.getString(R.string.year_x).replace("X", movies[position].year.toString())
        holder.binding.xTime.text = context.getString(R.string.minutes_x).replace("X", movies[position].runtime.toString())
        Glide.with(holder.itemView.context).load(movies[position].poster).into(holder.binding.xThumbnail)
    }
}