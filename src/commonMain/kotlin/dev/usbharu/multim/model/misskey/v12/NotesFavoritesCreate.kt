package dev.usbharu.multim.model.misskey.v12

import kotlinx.serialization.Serializable

@Serializable
data class NotesFavoritesCreateRequest(
    val noteId: String
)
