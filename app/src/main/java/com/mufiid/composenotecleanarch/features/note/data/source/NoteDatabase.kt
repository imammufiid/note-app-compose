package com.mufiid.composenotecleanarch.features.note.data.source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.mufiid.composenotecleanarch.features.note.domain.model.Note

@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDatabase: RoomDatabase() {
    abstract val noteDao: NoteDao
}