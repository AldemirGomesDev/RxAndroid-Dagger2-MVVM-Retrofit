package com.aldemir.mvvmdagger2rxjavaretrofit.model.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.aldemir.mvvmdagger2rxjavaretrofit.model.Post
import com.aldemir.mvvmdagger2rxjavaretrofit.model.PostDao


@Database(entities = [Post::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun postDao(): PostDao
}