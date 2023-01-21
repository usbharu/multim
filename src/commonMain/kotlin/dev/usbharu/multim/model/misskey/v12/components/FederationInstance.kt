package dev.usbharu.multim.model.misskey.v12.components

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Serializable

@Serializable
data class FederationInstance(
    val id: String,
    val caughtAt: LocalDateTime,
    val host: String,
    val usersCount: Int,
    val noteCount: Int,
    val followingCount: Int,
    val followersCount: Int,
    val latestRequestSentAt: LocalDateTime?,
    val lastCommunicatedAt: LocalDateTime,
    val isNotResponding: Boolean,
    val isSuspended: Boolean,
    val isBlocked: Boolean,
    val softwareName: String?,
    val softwareVersion: String?,
    val openRegistrations: Boolean?,
    val name: String?,
    val description: String?,
    val maintainerName: String?,
    val maintainerEmail: String?,
    val iconUrl: String?,
    val faviconUrl: String?,
    val themeColor: String?,
    val infoUpdatedAt: LocalDateTime?
)
