package com.barreto.koinmvvmkt.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.barreto.koinmvvmkt.repositories.UserRepository
import kotlinx.coroutines.launch

class UserViewModel(
    private val userRepository: UserRepository
) : ViewModel() {

    fun getAllUsers() = viewModelScope.launch{

        val users = userRepository.getAllUsers()

        for (user in users){
            Log.i("Tiago",user.login)
        }

    }

}