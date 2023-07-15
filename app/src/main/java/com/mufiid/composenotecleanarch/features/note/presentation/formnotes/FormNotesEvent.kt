package com.mufiid.composenotecleanarch.features.note.presentation.formnotes

import androidx.compose.ui.focus.FocusState

sealed class FormNotesEvent {
    data class EnteredTitle(val value: String) : FormNotesEvent()
    data class ChangeTitleFocus(val focusState: FocusState) : FormNotesEvent()
    data class EnteredContent(val value: String) : FormNotesEvent()
    data class ChangeContentFocus(val focusState: FocusState) : FormNotesEvent()
    data class ChangeColor(val color: Int) : FormNotesEvent()
    object SaveNote : FormNotesEvent()
}