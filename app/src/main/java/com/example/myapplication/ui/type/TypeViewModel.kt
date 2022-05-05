package com.example.myapplication.ui.type

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.R
import com.example.myapplication.model.TypeData

class TypeViewModel : ViewModel() {
    private val _image = MutableLiveData<Int>()
    val image: LiveData<Int> = _image

    private val _desc = MutableLiveData<String>()
    val desc: LiveData<String> = _desc

    private val _detail = MutableLiveData<String>()
    val detail: LiveData<String> = _detail

    fun loadData(): List<TypeData> {
        return listOf(
            TypeData(R.drawable.type1, R.string.jenis1, R.string.detail1),
            TypeData(R.drawable.type2, R.string.jenis2, R.string.detail2),
            TypeData(R.drawable.type3, R.string.jenis3, R.string.detail3),
            TypeData(R.drawable.type4, R.string.jenis4, R.string.detail4),
            TypeData(R.drawable.type5, R.string.jenis5, R.string.detail5),
            TypeData(R.drawable.type6, R.string.jenis6, R.string.detail6),
            TypeData(R.drawable.type7, R.string.jenis7, R.string.detail7)
        )
    }

    fun setData(data: TypeData, context: Context){
        _image.value = data.imageResourceId
        _desc.value = context.getString(data.descResourceId)
        _detail.value = context.getString(data.detailResourceId)
    }
}