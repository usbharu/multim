package dev.usbharu.multim.model.misskey.v12.components

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Serializable

@Serializable
data class GalleryPost(
    val id: String,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime,
    val title: String,
    val description: String?,
    val userId: Boolean,
    val user: UserLite,
    val fileIds: List<String>? = listOf(),
    val files: List<DriveFile>? = listOf(),
    val tags: List<String>? = listOf(),
    val isSensitive: Boolean
)
