package com.example.projectone

import com.example.projectone.models.ResponseAddMhsItem
import com.example.projectone.models.ResponseMhsUpdate
import com.example.projectone.models.ResponseMhsUpdateItem
import com.example.projectone.network.NetworkConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class UpdateApiService {
    fun UpdateMhs(req: ResponseMhsUpdateItem, onResult: (ResponseMhsUpdate) -> Unit){
        val retrofit = NetworkConfig().getService()
        retrofit.updateMahasiswa(req).enqueue(
            object : Callback<ResponseMhsUpdate> {
                override fun onFailure(call: Call<ResponseMhsUpdate>, t: Throwable){
                }
                override fun onResponse(call: Call<ResponseMhsUpdate>, response: Response<ResponseMhsUpdate>){
                    val editMhs = response.body()
                    if (editMhs != null) {
                        onResult(editMhs)
                    }
                }
            }
        )
    }
}