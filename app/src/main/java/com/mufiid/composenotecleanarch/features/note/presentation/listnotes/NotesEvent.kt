package com.mufiid.composenotecleanarch.features.note.presentation.listnotes

import com.mufiid.composenotecleanarch.features.note.domain.model.Note
import com.mufiid.composenotecleanarch.features.note.domain.utils.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}
