package com.example.showphotomvvm.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.showphotomvvm.data.model.ImagesModel
import com.example.showphotomvvm.databinding.ActivityMainBinding
import com.example.showphotomvvm.ui.Adapter.ImageAdapter
import com.example.showphotomvvm.ui.viewModel.ImageViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    val vm by lazy {
        ViewModelProvider(this).get(ImageViewModel::class.java)
    }
    val list= arrayListOf<ImagesModel>()
    val adapter = ImageAdapter(list)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.rv.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = this@MainActivity.adapter
        }
        vm.fetch()

        vm.images.observe(this, Observer {
            if(!it.isNullOrEmpty()){
                list.addAll(it)
                adapter.notifyDataSetChanged()
            }
            else{

            }

        })

    }
}