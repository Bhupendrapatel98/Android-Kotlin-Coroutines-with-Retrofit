package com.hackerkernel.kotlinquizapplication.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.hackerkernel.kotlinquizapplication.repository.PostRepository

class PostViewModelFactory(private val postRepository: PostRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T  {
       return PostViewModel(postRepository) as T
    }
}