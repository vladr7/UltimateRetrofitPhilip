package com.example.ultimateretrofitphilip


import com.google.gson.annotations.SerializedName

data class Todo(
    val completed: Boolean,
    val id: Int,
    val title: String,
    val userId: Int
)