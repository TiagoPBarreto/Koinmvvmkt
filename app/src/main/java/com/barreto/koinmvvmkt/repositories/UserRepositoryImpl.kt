package com.barreto.koinmvvmkt.repositories

import com.barreto.koinmvvmkt.api.UserApi
import com.barreto.koinmvvmkt.model.User

class UserRepositoryImpl(
    private val userApi:UserApi
) : UserRepository{
    override suspend fun getAllUsers(): List<User> = userApi.getAllUsers()


}