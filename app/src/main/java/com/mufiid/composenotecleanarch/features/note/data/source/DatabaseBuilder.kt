package com.mufiid.composenotecleanarch.features.note.data.source

import android.app.Application
import androidx.room.Room
import androidx.room.RoomDatabase
import java.util.concurrent.Executors

class DatabaseBuilder {
    companion object {
        fun <T> buildDatabase(application: Application, database: Class<T>) where T : RoomDatabase =
            Room.databaseBuilder(application, database, database.name)
                .fallbackToDestructiveMigration()
                .setQueryCallback(object : RoomDatabase.QueryCallback {
                    override fun onQuery(sqlQuery: String, bindArgs: List<Any?>) {
                        println("SQL Query: $sqlQuery SQL Args: $bindArgs")
                    }
                },Executors.newSingleThreadExecutor())
                .build()
    }
}