package com.example.myapplication.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.model.TypeData
import com.example.myapplication.ui.type.TypeDetailActivity
import com.example.myapplication.ui.type.TypeViewModel

class TypeAdapter(
    private val context: Context,
    private val dataset: List<TypeData>
): RecyclerView.Adapter<TypeAdapter.TypeViewHolder>() {
    private val viewModel = TypeViewModel()

    class TypeViewHolder(val view: View) : RecyclerView.ViewHolder(view){
        val imageView: ImageView = view.findViewById(R.id.item_type_image)
        val desc: TextView = view.findViewById(R.id.type)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TypeViewHolder {
        val adapterLayout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.type_item, parent,false)
        return TypeViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: TypeViewHolder, position: Int) {
        val item = dataset[position]
        holder.imageView.setImageResource(item.imageResourceId)
        holder.desc.text = context.resources.getString(item.descResourceId)

        holder.view.setOnClickListener{
            viewModel.setData(item, context)
            val intent = Intent(context, TypeDetailActivity::class.java).apply {
                putExtra("image", viewModel.image.value)
                putExtra("desc", viewModel.desc.value)
                putExtra("detail", viewModel.detail.value)
            }
            context.startActivity(intent)
        }
    }
    override fun getItemCount() = dataset.size
}