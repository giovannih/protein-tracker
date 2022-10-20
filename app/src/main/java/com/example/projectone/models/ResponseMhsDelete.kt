package com.example.projectone.models

import com.google.gson.annotations.SerializedName

data class ResponseMhsDelete(

	@field:SerializedName("ResponseMhsDelete")
	val responseMhsDelete: List<ResponseMhsDeleteItem?>? = null
)

data class ResponseMhsDeleteItem(

	@field:SerializedName("nim")
	val nim: String? = null,

	@field:SerializedName("nim_progmob")
	val nim_progmob: String? = null,

	)
