package dev.usbharu.multim.misskey.v13.model

import dev.usbharu.multim.misskey.v13.model.components.MisskeyNeedAuth
import kotlinx.serialization.Serializable

@Serializable
data class NotesWatchingDeleteRequest(
    val noteId: String
) : MisskeyNeedAuth()
