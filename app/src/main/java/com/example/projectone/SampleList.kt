package com.example.projectone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class SampleList : AppCompatActivity() {
    lateinit var btnList : Button;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_list)

        btnList = findViewById(R.id.btnShowList)

        btnList.setOnClickListener(
            View.OnClickListener { view ->
                setContentView(R.layout.activity_sample_list_view)
            }
        )
    }
}