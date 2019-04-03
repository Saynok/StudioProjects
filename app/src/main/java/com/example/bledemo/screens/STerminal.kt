package com.example.bledemo.screens

import android.widget.TextView
import com.example.bledemo.R
import com.sup.dev.android.libs.screens.Screen

class STerminal(
    text: String
) : Screen(R.layout.screen_terminal) {

    private val vText: TextView = findViewById(R.id.vText)

    init {
        setText(text)
    }

    fun setText(text: String) {

        vText.text = "$text!!!"
}
    fun getText() = vText.text.toString()


}