package com.generation.todolist.api

import com.generation.todolist.model.Categoria
import retrofit2.Response

class Repository {

    suspend fun lisCategoria(): Response<List<Categoria>> {
        return RetrofitInstance.api.listCategoria()
    }
}