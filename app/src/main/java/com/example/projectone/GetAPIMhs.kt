package com.example.projectone

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projectone.adapter.MahasiswaAdapter
import com.example.projectone.models.ResponseMhsItem
import com.example.projectone.network.NetworkConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class GetAPIMhs : AppCompatActivity(){
    lateinit var rvUserAPI : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_apiactivity)
        rvUserAPI = findViewById(R.id.rvUserAPI)

        registerForContextMenu(rvUserAPI)
        NetworkConfig().getService().getMahasiswa()
            .enqueue(object : Callback<List<ResponseMhsItem>> {
                override fun onFailure(
                    call: Call<List<ResponseMhsItem>>, t:
                    Throwable
                ) = Toast.makeText(
                    this@GetAPIMhs, t.localizedMessage,
                    Toast.LENGTH_SHORT
                ).show()

                override fun onResponse(
                    call: Call<List<ResponseMhsItem>>,
                    response: Response<List<ResponseMhsItem>>
                ) {
                    rvUserAPI.apply {
                        layoutManager = LinearLayoutManager(this@GetAPIMhs)
                        adapter = MahasiswaAdapter(response.body())
                    }
                }
            })
    }


}