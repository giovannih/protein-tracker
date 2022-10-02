package com.example.projectone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MenuEditActivity : AppCompatActivity() {
    lateinit var editText : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_edit)
        editText = findViewById(R.id.textEdit)
        val text = intent.getStringExtra("username")
        editText.text = text
    }
}