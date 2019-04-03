package com.example.bledemo.app

import android.app.Application
import com.sup.dev.android.app.SupAndroid

class App : Application(){
    override fun onCreate() {
        super.onCreate()
        SupAndroid.init(applicationContext)

    }
}