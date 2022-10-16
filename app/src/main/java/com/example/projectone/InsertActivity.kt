package com.example.projectone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.projectone.models.ResponseAddMhsItem

class InsertActivity : AppCompatActivity() {
    lateinit var editNim: EditText
    lateinit var editNama: EditText
    lateinit var editEmail: EditText
    lateinit var editAlamat: EditText
    lateinit var editNimProgmob: EditText
    lateinit var editFoto: EditText
    lateinit var btnPost: Button
    override fun onCreate(saveditInstanceState: Bundle?) {
        super.onCreate(saveditInstanceState)
        setContentView(R.layout.activity_insert)

        editNim = findViewById(R.id.editNim)
        editNama = findViewById(R.id.editNama)
        editEmail = findViewById(R.id.editEmail)
        editAlamat = findViewById(R.id.editAlamat)
        editFoto = findViewById(R.id.editFoto)
        editNimProgmob = findViewById(R.id.editNimProgmob)
        btnPost = findViewById(R.id.btnPost)

        btnPost.setOnClickListener(View.OnClickListener { view ->
            val nim = editNim.text.toString()
            val nama = editNama.text.toString()
            val email = editEmail.text.toString()
            val foto = editFoto.text.toString()
            val alamat = editAlamat.text.toString()
            val nim_progmob = editNimProgmob.text.toString()

            val postservice = PostApiService()
            val MhsData = ResponseAddMhsItem(
                id = null,
                nim = nim,
                nama = nama,
                email = email,
                foto = foto,
                alamat = alamat,
                nim_progmob = nim_progmob
            )

            postservice.addMhs(MhsData) {
                if (ResponseAddMhsItem().id != null) {
                    println("Success")
                } else {
                    println("error")
                }
            }
        })
    }
}