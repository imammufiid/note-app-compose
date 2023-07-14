package com.mufiid.composenotecleanarch.features.note.presentation.listnotes

import com.mufiid.composenotecleanarch.features.note.domain.model.Note
import com.mufiid.composenotecleanarch.features.note.domain.utils.NoteOrder
import com.mufiid.composenotecleanarch.features.note.domain.utils.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
) {
}