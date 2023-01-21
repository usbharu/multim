package dev.usbharu.multim.model.misskey.v12.components

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Serializable

@Serializable
data class NoteFavorite(
    val id: String,
    val createdAt: LocalDateTime,
    val note: Note,
    val noteId: String
)
