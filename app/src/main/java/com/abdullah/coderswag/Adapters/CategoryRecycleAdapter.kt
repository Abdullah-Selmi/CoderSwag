package com.abdullah.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.abdullah.coderswag.Model.Category
import com.abdullah.coderswag.R

class CategoryRecycleAdapter(val contex : Context, val categories : List<Category>, val itemClick: (Category) -> Unit) : RecyclerView.Adapter<CategoryRecycleAdapter.Holder>() {

    inner class Holder(itemView: View, itemClick: (Category) -> Unit) : RecyclerView.ViewHolder(itemView) {

        val categoryImage = itemView.findViewById<ImageView>(R.id.categoryimage)
        val categoryName = itemView.findViewById<TextView>(R.id.categoryName)

        fun bindCategory(category : Category, contex : Context) {
            val resourceId = contex.resources.getIdentifier(category.image, "drawable", contex.packageName)
            categoryImage.setImageResource(resourceId)
            categoryName.text = category.title
            itemView.setOnClickListener { itemClick(category) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(contex).inflate(R.layout.category_list_item, parent, false)

        return Holder(view, itemClick)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindCategory(categories[position], contex)
    }
}