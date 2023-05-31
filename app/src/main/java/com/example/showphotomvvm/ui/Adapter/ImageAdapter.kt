package com.example.showphotomvvm.ui.Adapter

import android.view.LayoutInflater
import android.view.PixelCopy
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.showphotomvvm.data.model.ImagesModel
import com.example.showphotomvvm.databinding.ItemImageBinding
import com.example.showphotomvvm.ui.Adapter.ImageAdapter.*
import com.squareup.picasso.Picasso

class ImageAdapter(private val imageList: List<ImagesModel>) :
    RecyclerView.Adapter<ImageAdapter.ImageRecyclerViewholder>() {

    inner class ImageRecyclerViewholder(val binding: ItemImageBinding):RecyclerView.ViewHolder(binding.root)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageRecyclerViewholder {

        val binding = ItemImageBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ImageRecyclerViewholder(binding)
    }

    override fun getItemCount() = imageList.size

    override fun onBindViewHolder(holder: ImageRecyclerViewholder, position: Int) {
        with(holder){
            with(imageList[position]){
                Picasso.get().load(this.url).into(binding.iv)
            }
        }
    }

}



