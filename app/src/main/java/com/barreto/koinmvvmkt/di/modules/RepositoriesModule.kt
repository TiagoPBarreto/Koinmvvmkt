package com.barreto.koinmvvmkt.di.modules

import com.barreto.koinmvvmkt.api.UserApi
import com.barreto.koinmvvmkt.repositories.UserRepository
import com.barreto.koinmvvmkt.repositories.UserRepositoryImpl
import org.koin.core.context.GlobalContext.get
import org.koin.dsl.module

val repositoriesModule = module{
    single <UserRepository>{
        provideUserRepository(get())
    }
}

fun provideUserRepository(userApi : UserApi) : UserRepository {
    return UserRepositoryImpl(
        userApi = userApi
    )
}
