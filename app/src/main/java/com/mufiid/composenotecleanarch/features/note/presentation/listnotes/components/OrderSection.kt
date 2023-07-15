package com.mufiid.composenotecleanarch.features.note.presentation.listnotes.components

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mufiid.composenotecleanarch.features.note.domain.utils.NoteOrder
import com.mufiid.composenotecleanarch.features.note.domain.utils.OrderType

@Composable
fun OrderSection(
    modifier: Modifier,
    noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    onOrderChange: (NoteOrder) -> Unit,
) {
    Column(modifier = modifier) {
        Row(modifier = Modifier.fillMaxWidth()) {
            DefaultRadioButton(
                text = "Title",
                selected = noteOrder is NoteOrder.Title,
                onSelect = { onOrderChange(NoteOrder.Title(noteOrder.orderType)) }
            )
            Spacer(modifier = Modifier.width(8.dp))
            Row(modifier = Modifier.fillMaxWidth()) {
                DefaultRadioButton(
                    text = "Date",
                    selected = noteOrder is NoteOrder.Date,
                    onSelect = { onOrderChange(NoteOrder.Title(noteOrder.orderType)) }
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            Row(modifier = Modifier.fillMaxWidth()) {
                DefaultRadioButton(
                    text = "Color",
                    selected = noteOrder is NoteOrder.Color,
                    onSelect = { onOrderChange(NoteOrder.Title(noteOrder.orderType)) }
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))
        Row(modifier = Modifier.fillMaxWidth()) {
            DefaultRadioButton(
                text = "Ascending",
                selected = noteOrder.orderType is OrderType.Ascending,
                onSelect = { onOrderChange(noteOrder.copy(OrderType.Ascending)) }
            )
            Spacer(modifier = Modifier.width(8.dp))
            Row(modifier = Modifier.fillMaxWidth()) {
                DefaultRadioButton(
                    text = "Descending",
                    selected = noteOrder.orderType is OrderType.Descending,
                    onSelect = { onOrderChange(noteOrder.copy(OrderType.Ascending)) }
                )
            }
        }

    }

}