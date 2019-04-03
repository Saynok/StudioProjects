package com.example.bledemo.app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.bledemo.R

import com.example.bledemo.screens.SScan
import com.sup.dev.android.libs.screens.activity.SActivity
import com.sup.dev.android.libs.screens.navigator.Navigator

class MainActivity : SActivity() {
    override fun toMainScreen() {
        Navigator.set(SScan())
    }
}
