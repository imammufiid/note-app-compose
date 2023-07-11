package com.mufiid.composenotecleanarch.features.note.domain.utils


sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}
