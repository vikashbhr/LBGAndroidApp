package com.example.lbgandroidapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lbgandroidapp.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainActivityViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.xRecyclerView.also {
            it.layoutManager = LinearLayoutManager(this)
            it.hasFixedSize()

        }

        viewModel.getMovies().observe(this, Observer {
            val adapter = MoviesAdapter(it)
            binding.xRecyclerView.adapter = adapter
            binding.xProgress.visibility = View.GONE
        })

    }
}