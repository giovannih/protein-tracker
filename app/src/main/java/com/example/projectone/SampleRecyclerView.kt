package com.example.projectone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projectone.adapter.PetaniAdapterRV
import com.example.projectone.models.Petani

class SampleRecyclerView : AppCompatActivity() {
    lateinit var rvSample : RecyclerView //recycler view
    lateinit var petaniAdapter: PetaniAdapterRV //adapter
    lateinit var lPetani: List<Petani> //list of obj

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_recycler_view)

        rvSample = findViewById(R.id.rvLatihan)

        lPetani = listOf(
            Petani(user="AW1",nama="Giovanni Harrius", jumlahLahan = "100", identifikasi = "50", tambahLahan = "10"),
            Petani(user="AW2",nama="Jessica Ivana", jumlahLahan = "100", identifikasi = "50", tambahLahan = "10"),
            Petani(user="AW3",nama="Giovanni Harrius", jumlahLahan = "100", identifikasi = "50", tambahLahan = "10"),
            Petani(user="AW4",nama="Giovanni Harrius", jumlahLahan = "100", identifikasi = "50", tambahLahan = "10"),
            Petani(user="AW5",nama="Giovanni Harrius", jumlahLahan = "100", identifikasi = "50", tambahLahan = "10")
        )
        petaniAdapter = PetaniAdapterRV(lPetani)

        rvSample.apply {
            layoutManager = LinearLayoutManager(this@SampleRecyclerView)
            adapter = petaniAdapter
        }
    }
}