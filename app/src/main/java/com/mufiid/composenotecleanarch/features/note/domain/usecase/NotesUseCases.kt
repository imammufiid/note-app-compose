package com.mufiid.composenotecleanarch.features.note.domain.usecase

data class NotesUseCases(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote
)
