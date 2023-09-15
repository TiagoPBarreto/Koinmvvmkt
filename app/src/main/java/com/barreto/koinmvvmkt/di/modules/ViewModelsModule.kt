package com.barreto.koinmvvmkt.di.modules

import com.barreto.koinmvvmkt.repositories.UserRepository
import com.barreto.koinmvvmkt.viewmodel.UserViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelsModule = module {

    viewModel {
        providerUserViewModel(get())
    }

}

fun providerUserViewModel(userRepository: UserRepository) : UserViewModel {
    return UserViewModel(
        userRepository = userRepository
    )
}
