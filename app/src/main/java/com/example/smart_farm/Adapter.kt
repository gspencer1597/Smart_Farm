package com.example.smart_farm

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class Adapter(private val props : ArrayList<Props>) : RecyclerView.Adapter<Adapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item,
        parent,false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = props[position]
        holder.titleImage.setImageResource(currentItem.titleImage)
        holder.tvHeadding.text = currentItem.heading
    }

    override fun getItemCount(): Int {
        return props.size
    }
    class ViewHolder(itemView : View): RecyclerView.ViewHolder(itemView){
        val titleImage : ShapeableImageView = itemView.findViewById(R.id.title_image)
        val tvHeadding : TextView = itemView.findViewById(R.id.status)

    }
}