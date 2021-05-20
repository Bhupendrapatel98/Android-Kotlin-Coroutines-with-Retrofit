package com.hackerkernel.kotlinquizapplication.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.hackerkernel.kotlinquizapplication.R
import com.hackerkernel.kotlinquizapplication.model.Post

 class PostAdapter(val context:Context,var postList:ArrayList<Post>) : RecyclerView.Adapter<PostAdapter.PostViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder =
        PostViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.each_row,parent,false))


    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val post=postList[position]
        holder.id.text=post.id.toString()
        holder.title.text=post.title
    }

    override fun getItemCount(): Int = postList.size


     class PostViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview){
         val id:TextView = itemview.findViewById(R.id.id)
         val title:TextView=itemView.findViewById(R.id.title)
     }

     fun setPostData(postList: ArrayList<Post>)
     {
         this.postList=postList
         notifyDataSetChanged()
     }

 }