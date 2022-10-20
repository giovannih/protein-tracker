package com.example.projectone

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.projectone.models.ResponseMhsDeleteItem

class DeleteActivity : AppCompatActivity(){
    lateinit var delNim : EditText
    lateinit var delNimProgmob : EditText
    lateinit var btnDel : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delete)
        delNim = findViewById(R.id.editNim)
        delNimProgmob = findViewById(R.id.editNimProgmob)
        btnDel = findViewById(R.id.btnPost)

        btnDel.setOnClickListener(View.OnClickListener { view ->
            val Nim = delNim.text.toString()
            val nim_progmob = delNimProgmob.text.toString()

            val deleteservice = DeleteApiService()
            val MhsData = ResponseMhsDeleteItem(
                nim = Nim, nim_progmob = nim_progmob)

            deleteservice.DeleteMhs(MhsData){

            }
        })
    }

}