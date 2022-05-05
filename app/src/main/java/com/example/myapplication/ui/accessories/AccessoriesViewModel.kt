package com.example.myapplication.ui.accessories

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.R
import com.example.myapplication.model.AccessoriesData

class AccessoriesViewModel : ViewModel() {
    private val _image = MutableLiveData<Int>()
    val image : LiveData<Int> = _image

    fun loadData(): List<AccessoriesData>{
        return listOf(
            AccessoriesData(R.drawable.acs1),
            AccessoriesData(R.drawable.acs2),
            AccessoriesData(R.drawable.acs3),
            AccessoriesData(R.drawable.acs4),
            AccessoriesData(R.drawable.acs5)
        )
    }

    fun setData(data: AccessoriesData){
        _image.value =data.imageResourceId
    }
}