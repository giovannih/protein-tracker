package com.example.projectone.models

import com.google.gson.annotations.SerializedName

data class ResponseAddMhs (
    @field:SerializedName("ResponseAddMhs")
    val responseAddMhs: List<ResponseAddMhsItem?>? = null
)
data class ResponseAddMhsItem(

    @field:SerializedName("nim")
    val nim: String? = null,

    @field:SerializedName("nama")
    val nama: String? = null,

    @field:SerializedName("foto")
    val foto: String? = null,

    @field:SerializedName("id")
    val id: Int? = null,

    @field:SerializedName("email")
    val email: String? = null,

    @field:SerializedName("alamat")
    val alamat: String? = null,

    @field:SerializedName("nim_progmob")
    val nim_progmob: String? = null

)