package com.barreto.koinmvvmkt

import android.app.Application
import com.barreto.koinmvvmkt.di.appModule
import org.koin.core.context.startKoin

class AppApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(
                appModule
            )
        }
    }
}