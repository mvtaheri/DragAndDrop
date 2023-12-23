package com.vahid.drageanddrop

import androidx.compose.ui.graphics.Color

data class PersonUiItem(
    var name: String,
    val id: Int,
    val backgroundColor: Color,
    var isDraged: Boolean = false
)
