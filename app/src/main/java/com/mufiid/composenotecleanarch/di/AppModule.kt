package com.mufiid.composenotecleanarch.di

import android.app.Application
import com.mufiid.composenotecleanarch.features.note.data.repository.NoteRepositoryImpl
import com.mufiid.composenotecleanarch.features.note.data.source.DatabaseBuilder
import com.mufiid.composenotecleanarch.features.note.data.source.NoteDatabase
import com.mufiid.composenotecleanarch.features.note.domain.repository.NoteRepository
import com.mufiid.composenotecleanarch.features.note.domain.usecase.DeleteNote
import com.mufiid.composenotecleanarch.features.note.domain.usecase.GetNotes
import com.mufiid.composenotecleanarch.features.note.domain.usecase.NotesUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(app: Application): NoteDatabase {
        return DatabaseBuilder.buildDatabase(app, NoteDatabase::class.java)
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDatabase): NoteRepository {
        return NoteRepositoryImpl(dao = db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository): NotesUseCases {
        return NotesUseCases(
            getNotes = GetNotes(repository),
            deleteNote = DeleteNote(repository)
        )
    }
}