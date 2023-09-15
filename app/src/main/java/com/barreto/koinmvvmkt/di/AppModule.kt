package com.barreto.koinmvvmkt.di

import com.barreto.koinmvvmkt.di.modules.apiModule
import com.barreto.koinmvvmkt.di.modules.repositoriesModule
import com.barreto.koinmvvmkt.di.modules.viewModelsModule

val appModule = listOf(
    apiModule,
    repositoriesModule,
    viewModelsModule
)