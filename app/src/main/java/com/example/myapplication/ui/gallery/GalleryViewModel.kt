package com.example.myapplication.ui.gallery

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.R
import com.example.myapplication.model.GalleryData

class GalleryViewModel : ViewModel() {

    private val _image = MutableLiveData<Int>()
    val image: LiveData<Int> = _image

    private val _name = MutableLiveData<String>()
    val name: LiveData<String> = _name

    private val _desc = MutableLiveData<String>()
    val desc: LiveData<String> = _desc

    fun loadData(): List<GalleryData>{
        return listOf(
            GalleryData(R.drawable.motor1, R.string.merk1, R.string.desc1),
            GalleryData(R.drawable.motor2, R.string.merk2, R.string.desc2),
            GalleryData(R.drawable.motor3, R.string.merk3, R.string.desc3),
            GalleryData(R.drawable.motor4, R.string.merk4, R.string.desc4),
            GalleryData(R.drawable.motor5, R.string.merk5, R.string.desc5),
            GalleryData(R.drawable.motor6, R.string.merk6, R.string.desc6),
            GalleryData(R.drawable.motor7, R.string.merk7, R.string.desc7),
            GalleryData(R.drawable.motor8, R.string.merk8, R.string.desc8)
        )
    }

    fun setData(data: GalleryData, context: Context){
        _image.value = data.imageResourceId
        _name.value = context.getString(data.nameResourceId)
        _desc.value = context.getString(data.descResourceId)
    }
}