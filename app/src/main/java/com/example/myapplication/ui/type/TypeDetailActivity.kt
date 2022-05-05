package com.example.myapplication.ui.type

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityTypeDetailBinding

class TypeDetailActivity : AppCompatActivity() {
    private var _binding : ActivityTypeDetailBinding? = null
    private val binding get() = _binding!!

    companion object{
        const val EXTRA_IMAGE = "image"
        const val EXTRA_DESCRIPTION = "desc"
        const val EXTRA_DETAIL = "detail"
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        _binding = ActivityTypeDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val image = binding.detailType
        image.setImageResource(intent.getIntExtra(EXTRA_IMAGE, 0))

        val desc = binding.descType
        desc.text = intent.getStringExtra(EXTRA_DESCRIPTION)

        val detail = binding.typeDetail
        detail.text = intent.getStringExtra(EXTRA_DETAIL)
    }
}