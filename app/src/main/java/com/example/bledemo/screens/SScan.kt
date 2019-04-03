package com.example.bledemo.screens

import android.widget.Button
import android.widget.Toolbar
import com.example.bledemo.R
import com.sup.dev.android.libs.screens.Screen
import com.sup.dev.android.libs.screens.navigator.Navigator

class SScan : Screen(R.layout.screen_scan) {

    private var vButtonGoto: Button = findViewById(R.id.vButtonGoto)

    init {
        vButtonGoto.text = "1 screen"
        vButtonGoto.setOnClickListener { Navigator.to(STerminal("2 screen!")) }
    }
}