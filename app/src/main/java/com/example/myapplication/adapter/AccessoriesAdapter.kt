package com.example.myapplication.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.model.AccessoriesData
import com.example.myapplication.ui.accessories.AccessoriesDetailActivity
import com.example.myapplication.ui.accessories.AccessoriesViewModel

class AccessoriesAdapter(
    private val context: Context,
    private val dataset: List<AccessoriesData>
) : RecyclerView.Adapter<AccessoriesAdapter.AccViewHolder>() {
    private val viewModel = AccessoriesViewModel()

    class AccViewHolder(val view: View) : RecyclerView.ViewHolder(view){
        val imageView : ImageView = view.findViewById(R.id.item_acc_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AccViewHolder {
        val adapterLayout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.accessories_item, parent, false)
        return AccViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: AccViewHolder, position: Int) {
        val item = dataset[position]
        holder.imageView.setImageResource(item.imageResourceId)

        holder.view.setOnClickListener{
            viewModel.setData(item)
            val intent = Intent(context, AccessoriesDetailActivity::class.java).apply {
                putExtra("image", viewModel.image.value)
            }
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = dataset.size
}