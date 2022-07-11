package com.example.model.response

import com.google.gson.annotations.SerializedName

data class MealsCategoriesResponse(val categories: List<MealResponse>)

// Gson deserialization  : JSON -> Data classes

data class MealResponse(
    @SerializedName("idCategory") val id: String,
    @SerializedName("strCategory") val name: String,
    @SerializedName("strCategoryThumb") val description: String,
    @SerializedName("strCategoryDescription") val imageUrl: String
)
