package com.example.projectone

import com.example.projectone.models.ResponseAddMhs
import com.example.projectone.models.ResponseAddMhsItem
import com.example.projectone.network.NetworkConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PostApiService {
    fun addMhs(req: ResponseAddMhsItem, onResult: (ResponseAddMhs) -> Unit){
        val retrofit = NetworkConfig().getService()
        retrofit.addMahasiswa(req).enqueue(
            object : Callback<ResponseAddMhs> {
                override fun onFailure(call: Call<ResponseAddMhs>, t: Throwable){
                }
                override fun onResponse(call: Call<ResponseAddMhs>, response: Response<ResponseAddMhs>){
                    val addedMhs = response.body()
                    if (addedMhs != null) {
                        onResult(addedMhs)
                    }
                }
            }
        )
    }
}