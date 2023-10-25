package com.example.lbgandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lbgandroidapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val repository: MyRepository = MyRepository()
    private val factory:MainActivityViewModelFactory = MainActivityViewModelFactory(repository)
    private lateinit var viewModel: MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this,factory)[MainActivityViewModel::class.java]

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