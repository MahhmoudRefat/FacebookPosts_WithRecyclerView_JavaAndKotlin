package com.example.facebookposts_withrecyclerview_javaandkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PostsAdapter_Kt (val items: List<PostData_Kt>)
    : RecyclerView.Adapter<PostsAdapter_Kt.ViewHolder>(){
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val acount_name: TextView = itemView.findViewById(R.id.acount_name)
        val post_word: TextView = itemView.findViewById(R.id.post_word)
        val post_date: TextView = itemView.findViewById(R.id.post_date)
        val post_link: TextView = itemView.findViewById(R.id.post_link)
        val like_number: TextView = itemView.findViewById(R.id.like_number)
        val tv_share_number: TextView = itemView.findViewById(R.id.tv_share_number)
        val post_image: ImageView = itemView.findViewById(R.id.post_image)
    }
    override fun getItemCount(): Int = items.size ?:0
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.post_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val contact = items?.get(position)
        if (contact != null) {
            holder.post_image.setImageResource(contact?.post_image ?: R.drawable.avatar_profile)
            holder.acount_name.text = contact?.acount_name
            holder.post_word.text = contact?.post_word
            holder.post_date.text = contact?.post_date.toString()
            holder.post_link.text = contact?.post_link
            holder.like_number.text = contact?.like_number.toString()
            holder.tv_share_number.text = contact?.tv_share_number.toString()

        }
    }



}