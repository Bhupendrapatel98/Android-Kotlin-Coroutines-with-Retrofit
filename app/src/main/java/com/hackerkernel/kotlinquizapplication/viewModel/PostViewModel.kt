package com.hackerkernel.kotlinquizapplication.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hackerkernel.kotlinquizapplication.model.Post
import com.hackerkernel.kotlinquizapplication.repository.PostRepository
import kotlinx.coroutines.launch

class PostViewModel(private val postRepository:PostRepository) : ViewModel() {

    val myResponse:MutableLiveData<List<Post>> = MutableLiveData()

    fun getPost(){
        viewModelScope.launch {
            val response = postRepository.getPost()
            myResponse.value = response
        }
    }
}