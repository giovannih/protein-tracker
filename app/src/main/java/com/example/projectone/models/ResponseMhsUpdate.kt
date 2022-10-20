package com.example.projectone.models

import com.google.gson.annotations.SerializedName

data class ResponseMhsUpdate(

	@field:SerializedName("ResponseMhsUpdate")
	val responseMhsUpdate: List<ResponseMhsUpdateItem?>? = null
)

data class ResponseMhsUpdateItem(

	@field:SerializedName("nim")
	val nim: String? = null,

	@field:SerializedName("nama")
	val nama: String? = null,

	@field:SerializedName("nim_cari")
	val nim_cari: String? = null,

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
