package dev.usbharu.multim.model.misskey.v12

import dev.usbharu.multim.model.misskey.v12.components.MisskeyNeedAuth
import kotlinx.serialization.Serializable

@Serializable
data class NotesThreadMutingDeleteRequest(
    val noteId: String
) : MisskeyNeedAuth()
