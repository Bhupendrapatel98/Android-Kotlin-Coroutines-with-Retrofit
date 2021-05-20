package com.hackerkernel.kotlinquizapplication.network

import com.hackerkernel.kotlinquizapplication.model.Post
import retrofit2.http.GET

interface Api {
    @GET("posts")
    suspend fun getAllPost(): List<Post>
    //suspend mtlb background me work kre
}