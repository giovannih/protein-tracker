package com.example.projectone;

import android.util.Log
import com.example.projectone.models.ResponseMhsDelete;
import com.example.projectone.models.ResponseMhsDeleteItem;
import com.example.projectone.network.NetworkConfig
import com.example.projectone.network.Users
import com.google.gson.GsonBuilder
import com.google.gson.JsonParser
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

class DeleteApiService {
    fun DeleteMhs(req: ResponseMhsDeleteItem, onResult: (ResponseMhsDelete) -> Unit){
        val retrofit = NetworkConfig().getService()
        retrofit.deleteMahasiswa(req).enqueue(
                object : Callback<ResponseMhsDelete> {
            override fun onFailure(call: Call<ResponseMhsDelete>, t: Throwable){
            }
            override fun onResponse(call: Call<ResponseMhsDelete>, response: Response<ResponseMhsDelete>){
                val DeletedMhs = response.body()
                if (DeletedMhs != null) {
                    onResult(DeletedMhs)
                }
            }
        }
        )
    }
//    fun deleteMethod() {
//
//        // Create Retrofit
//        val retrofit = Retrofit.Builder()
//            .baseUrl("https://kpsi.fti.ukdw.ac.id/")
//            .build()
//
//        // Create Service
//        val Users = retrofit.create(Users::class.java)
//
//        CoroutineScope(Dispatchers.IO).launch {
//
//            // Do the DELETE request and get response
//
//            val response = Users.deleteMahasiswa()
//            withContext(Dispatchers.Main) {
//                if (response.isSuccessful) {
//                    Log.e("SUCCESS",response.code().toString())
//
//                } else {
//
//                    Log.e("RETROFIT_ERROR", response.code().toString())
//
//                }
//            }
//        }
//    }
}
