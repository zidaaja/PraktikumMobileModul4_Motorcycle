package com.example.myapplication.ui.accessories

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityAccessoriesDetailBinding

class AccessoriesDetailActivity : AppCompatActivity() {
    private var _binding : ActivityAccessoriesDetailBinding? = null
    private val binding get() =_binding!!

    companion object{
        const val EXTRA_IMAGE = "image"
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        _binding = ActivityAccessoriesDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val image = binding.detailImageAcc
        image.setImageResource(intent.getIntExtra(EXTRA_IMAGE, 0))
    }
}