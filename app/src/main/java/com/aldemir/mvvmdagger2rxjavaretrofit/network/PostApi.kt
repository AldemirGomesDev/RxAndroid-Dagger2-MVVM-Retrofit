package com.aldemir.mvvmdagger2rxjavaretrofit.network

import com.aldemir.mvvmdagger2rxjavaretrofit.model.Post
import io.reactivex.Observable
import retrofit2.http.GET

interface PostApi {

    @GET("/posts")
    fun getPosts(): Observable<List<Post>>
}