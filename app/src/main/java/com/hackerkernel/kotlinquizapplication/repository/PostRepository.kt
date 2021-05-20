package com.hackerkernel.kotlinquizapplication.repository

import com.hackerkernel.kotlinquizapplication.model.Post
import com.hackerkernel.kotlinquizapplication.network.RetrofitBuilder

class PostRepository {
    suspend fun getPost(): List<Post> = RetrofitBuilder.api.getAllPost()
}