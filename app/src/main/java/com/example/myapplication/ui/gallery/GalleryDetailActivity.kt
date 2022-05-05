package com.example.myapplication.ui.gallery

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityGalleryDetailBinding

class GalleryDetailActivity : AppCompatActivity(){
    private var _binding: ActivityGalleryDetailBinding? = null
    private val binding get() = _binding!!

    companion object{
        const val EXTRA_IMAGE = "image"
        const val EXTRA_NAME = "name"
        const val EXTRA_DESCRIPTION = "desc"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityGalleryDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val image = binding.detailImage
        image.setImageResource(intent.getIntExtra(EXTRA_IMAGE, 0))

        val name = binding.merkDetail
        name.text = intent.getStringExtra(EXTRA_NAME)

        val desc = binding.descDetail
        desc.text = intent.getStringExtra(EXTRA_DESCRIPTION)
    }
}
