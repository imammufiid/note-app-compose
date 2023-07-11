package com.mufiid.composenotecleanarch.features.note.domain.usecase

import com.mufiid.composenotecleanarch.features.note.domain.model.Note
import com.mufiid.composenotecleanarch.features.note.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}