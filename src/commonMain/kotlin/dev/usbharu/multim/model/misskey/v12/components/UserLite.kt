package dev.usbharu.multim.model.misskey.v12.components

import kotlinx.serialization.Serializable

@Serializable
data class UserLite(
    val id: String,
    val name: String,
    val username: String = name,
    val host: String? = null,
    val avatarUrl: String? = null,
    val avatarBlurhash: String? = null,
    val avatarColor: String? = null,
    val isAdmin: Boolean = false,
    val isModerator: Boolean = false,
    val isBot: Boolean? = null,
    val isCat: Boolean? = null,
    val emojis: List<EmojiLite> = emptyList(),
    val onlineStatus: String = "online"
//    val onlineStatus: OnlineStatus
) : User()

enum class OnlineStatus(val string: String) {
    UNKNOWN("unknown"),
    ONLINE("online"),
    ACTIVE("active"),
    OFFLINE("offline")
}
