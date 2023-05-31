package com.example.showphotomvvm.ui.viewModel

import android.widget.ImageView
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.showphotomvvm.data.model.ImagesModel
import com.example.showphotomvvm.data.repos.ImageRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ImageViewModel : ViewModel(){
     val images = MutableLiveData<List<ImagesModel>>()
     fun fetch(){
         viewModelScope.launch {
             val response = withContext(Dispatchers.IO){ImageRepo.getAllImage()}
             if(response.isSuccessful){
                 response.body().let {
                     imageItem ->
                     images.postValue(imageItem)
                 }
             }
         }
     }
}