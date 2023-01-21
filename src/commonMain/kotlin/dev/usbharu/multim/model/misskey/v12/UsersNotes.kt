package dev.usbharu.multim.model.misskey.v12

import dev.usbharu.multim.model.misskey.v12.components.Note
import kotlinx.serialization.Serializable

@Serializable
data class UsersNotesRequest(
    val userId: String,
    val includeReplies: Boolean = true,
    val limit: Int = 10,
    val sinceId: String? = null,
    val untilId: String? = null,
    val sinceDate: Long? = null,
    val untilDate: Long? = null,
    val includeMyRenotes: Boolean? = null,
    val withFile: Boolean? = false,
    val fileType: List<String> = emptyList(),
    val excludeNsfw: Boolean = false
)


typealias UsersNotesResponse = List<Note>