package com.example.projectone

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.projectone.models.ResponseMhsUpdateItem

class UpdateActivity : AppCompatActivity() {
    lateinit var editNim: EditText
    lateinit var editNama: EditText
    lateinit var editEmail: EditText
    lateinit var editAlamat: EditText
    lateinit var editNimProgmob: EditText
    lateinit var editFoto: EditText
    lateinit var btnPost: Button
    lateinit var btnAPI : Button
    lateinit var editNimC : EditText

    override fun onCreate(saveditInstanceState: Bundle?) {
        super.onCreate(saveditInstanceState)
        setContentView(R.layout.activity_update)

        editNim = findViewById(R.id.editNim)
        editNama = findViewById(R.id.editNama)
        editEmail = findViewById(R.id.editEmail)
        editAlamat = findViewById(R.id.editAlamat)
        editFoto = findViewById(R.id.editFoto)
        editNimC = findViewById(R.id.editNimCari)
        editNimProgmob = findViewById(R.id.editNimProgmob)
        btnPost = findViewById(R.id.btnPost)
        btnAPI = findViewById(R.id.btnViewData)

        btnPost.setOnClickListener(View.OnClickListener { view ->
            val nim = editNim.text.toString()
            val nama = editNama.text.toString()
            val email = editEmail.text.toString()
            val nimCari = editNimC.text.toString()
            val foto = editFoto.text.toString()
            val alamat = editAlamat.text.toString()
            val nim_progmob = editNimProgmob.text.toString()

            val updateservice = UpdateApiService()
            val MhsData = ResponseMhsUpdateItem(
                nim = nim,
                nama = nama,
                email = email,
                foto = foto,
                alamat = alamat,
                nim_progmob = nim_progmob,
                nim_cari = nimCari
            )
            updateservice.UpdateMhs(MhsData){
            }
    })

}
}