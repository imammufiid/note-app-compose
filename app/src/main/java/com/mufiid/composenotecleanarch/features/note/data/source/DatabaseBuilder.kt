package com.mufiid.composenotecleanarch.features.note.data.source

import android.app.Application
import androidx.room.Room
import androidx.room.RoomDatabase

class DatabaseBuilder {
    companion object {
        fun <T> buildDatabase(application: Application, database: Class<T>) where T : RoomDatabase =
            Room.databaseBuilder(application, database, database.name)
                .fallbackToDestructiveMigration()
                .build()
    }
}