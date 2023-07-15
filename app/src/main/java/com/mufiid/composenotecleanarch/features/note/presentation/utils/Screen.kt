package com.mufiid.composenotecleanarch.features.note.presentation.utils

sealed class Screen(val route: String) {
    object NotesScreen: Screen("notes")
    object FormNotesScreen: Screen("form_notes")
}
