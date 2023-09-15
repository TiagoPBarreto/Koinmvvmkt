package com.barreto.koinmvvmkt.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.barreto.koinmvvmkt.api.UserApi
import com.barreto.koinmvvmkt.databinding.ActivityMainBinding
import com.barreto.koinmvvmkt.repositories.UserRepository
import com.barreto.koinmvvmkt.repositories.UserRepositoryImpl
import com.barreto.koinmvvmkt.viewmodel.UserViewModel
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.context.GlobalContext.get

class MainActivity : AppCompatActivity() {
    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val userViewModel : UserViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnCallNetwork.setOnClickListener {
            userViewModel.getAllUsers()
        }



    }
}