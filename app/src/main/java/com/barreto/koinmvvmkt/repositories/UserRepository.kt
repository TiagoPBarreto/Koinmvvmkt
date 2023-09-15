package com.barreto.koinmvvmkt.repositories

import com.barreto.koinmvvmkt.model.User

interface UserRepository {

    suspend fun getAllUsers(): List<User>
}