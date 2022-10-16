package com.example.projectone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tvMain : TextView
    lateinit var btnInputNama : Button
    lateinit var edInputNama : EditText
    lateinit var btnHelp : Button
    lateinit var btnLinear : Button
    lateinit var btnConstraint : Button
    lateinit var btnTable : Button
    lateinit var btnProtein : Button
    lateinit var btnRecycle : Button
    lateinit var btnCard : Button
    lateinit var btnAPI : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvMain = findViewById(R.id.tv_main_activity)
        tvMain.text = getString(R.string.text_progmob_main)
        btnInputNama = findViewById(R.id.btn_ambil_nama)
        btnHelp = findViewById(R.id.btn_help)
        btnLinear = findViewById(R.id.btn_linear)
        btnConstraint = findViewById(R.id.btn_constraint)
        btnTable = findViewById(R.id.btn_table)
        btnProtein = findViewById(R.id.btn_protein)
        btnRecycle = findViewById(R.id.btnSampleRV)
        btnCard = findViewById(R.id.btnCardView)
        btnAPI = findViewById(R.id.btnGetAPI)

        edInputNama = findViewById(R.id.ed_input_nama)
        btnInputNama.setOnClickListener(View.OnClickListener {
                view -> var strTmp = edInputNama.text.toString()
            tvMain.text = strTmp
        })
        btnRecycle.setOnClickListener(View.OnClickListener { view ->
            val intent = Intent(this@MainActivity,SampleRecyclerView::class.java)
            startActivity(intent)
            finish()
        })
        btnCard.setOnClickListener(View.OnClickListener { view ->
            val intent = Intent(this@MainActivity,SampleCardView::class.java)
            startActivity(intent)
            finish()
        })
        btnAPI.setOnClickListener(View.OnClickListener { view ->
            val bundle = Bundle()
            val intent = Intent(this@MainActivity,GetAPIActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
            finish()
        })

        btnHelp.setOnClickListener(View.OnClickListener { view ->
            var bundle = Bundle()
            var strTmp = edInputNama.text.toString()
            bundle.putString("tesText",strTmp)
            var intent = Intent(this@MainActivity,
                HelpActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
            finish()
        })
        btnLinear.setOnClickListener(View.OnClickListener { view ->
            setContentView(R.layout.test_linear)

        })
        btnConstraint.setOnClickListener(View.OnClickListener { view ->
            setContentView(R.layout.activity_constraint)

        })
        btnTable.setOnClickListener(View.OnClickListener { view ->
            setContentView(R.layout.activity_table)

        })

        btnProtein.setOnClickListener(View.OnClickListener { view ->
            setContentView(R.layout.activity_protein)

        })

    }
}