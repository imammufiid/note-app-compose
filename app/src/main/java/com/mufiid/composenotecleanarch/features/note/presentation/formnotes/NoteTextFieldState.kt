package com.mufiid.composenotecleanarch.features.note.presentation.formnotes

data class NoteTextFieldState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = false
)
