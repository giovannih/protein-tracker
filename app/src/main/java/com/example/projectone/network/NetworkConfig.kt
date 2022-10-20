package com.example.projectone.network

import com.example.projectone.models.*
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*

class NetworkConfig {
    // set interceptor
    fun getInterceptor() : OkHttpClient {
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY
        val okHttpClient = OkHttpClient.Builder()
            .addInterceptor(logging)
            .build()
        return okHttpClient
    }
    fun getRetrofit() : Retrofit {
        return Retrofit.Builder()
        .baseUrl("https://kpsi.fti.ukdw.ac.id/")
        .client(getInterceptor())
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    }
    fun getService() = getRetrofit().create(Users::class.java)
}
interface Users {
    @GET("users")
    fun getUsers(): Call<List<ResponseUsersItem>>

    @GET("api/progmob/mhs/010101")
    fun getMahasiswa(): Call<List<ResponseMhsItem>>

    @POST("api/progmob/mhs/create")
    fun addMahasiswa(@Body req : ResponseAddMhsItem): Call<ResponseAddMhs>

    @PUT("api/progmob/mhs/update")
    fun updateMahasiswa(@Body req : ResponseMhsUpdateItem): Call<ResponseMhsUpdate>

    @DELETE("api/progmob/mhs/delete/010101")
    fun deleteMahasiswa(@Body req: ResponseMhsDeleteItem): Call<ResponseMhsDelete>
}