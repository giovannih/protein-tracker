package com.example.projectone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projectone.adapter.PetaniAdapterRV
import com.example.projectone.adapter.PetaniCVAdapter
import com.example.projectone.models.Petani

class SampleCardView : AppCompatActivity() {
    lateinit var rvCardView: RecyclerView //recycler view
    lateinit var petaniAdapter: PetaniCVAdapter //adapter
    lateinit var lPetani: List<Petani> //list of obj
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_card_view)

        rvCardView = findViewById(R.id.rvCardView)

        lPetani = listOf(
            Petani(user="AW1",nama="Giovanni Harrius", jumlahLahan = "100", identifikasi = "50", tambahLahan = "10"),
            Petani(user="AW2",nama="Giovanni Harrius", jumlahLahan = "100", identifikasi = "50", tambahLahan = "10"),
            Petani(user="AW3",nama="Giovanni Harrius", jumlahLahan = "100", identifikasi = "50", tambahLahan = "10"),
            Petani(user="AW4",nama="Giovanni Harrius", jumlahLahan = "100", identifikasi = "50", tambahLahan = "10"),
            Petani(user="AW5",nama="Giovanni Harrius", jumlahLahan = "100", identifikasi = "50", tambahLahan = "10")
        )
        petaniAdapter = PetaniCVAdapter(lPetani)
        rvCardView.apply {
            layoutManager = LinearLayoutManager(this@SampleCardView)
            adapter = petaniAdapter
        }
    }
}