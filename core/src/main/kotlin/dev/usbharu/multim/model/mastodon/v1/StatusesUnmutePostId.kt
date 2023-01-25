package dev.usbharu.multim.model.mastodon.v1

import dev.usbharu.multim.model.mastodon.v1.components.Status
import kotlinx.serialization.Serializable

@Serializable
data class StatusesUnmutePostIdRequest(
    val id: String
)

typealias StatusesUnmutePostIdResponse = Status