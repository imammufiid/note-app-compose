package com.mufiid.composenotecleanarch.features.note.domain.usecase

import com.mufiid.composenotecleanarch.features.note.domain.model.Note
import com.mufiid.composenotecleanarch.features.note.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository,
) {
    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}