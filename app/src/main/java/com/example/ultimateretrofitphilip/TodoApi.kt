package com.example.ultimateretrofitphilip

import retrofit2.Response
import retrofit2.http.GET

interface TodoApi {

    @GET("/todos")
    suspend fun getTodos(): Response<List<Todo>>

//    @POST("/createTodo")
//    fun createTodo(@Body todo: Todo): Response<CreateTodoResponse>
}