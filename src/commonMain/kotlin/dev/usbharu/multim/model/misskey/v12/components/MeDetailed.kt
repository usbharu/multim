package dev.usbharu.multim.model.misskey.v12.components

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Serializable

@Serializable
class MeDetailed(
    val id: String,
    val name: String,
    val username: String,
    val host: String? = null,
    val avatarUrl: String? = null,
    val avatarBlurhash: String? = null,
    val avatarColor: String? = null,
    val isAdmin: Boolean = false,
    val isModerator: Boolean = false,
    val isBot: Boolean,
    val isCat: Boolean,
    val emojis: List<EmojiLite>,
    val onlineStatus: OnlineStatus,
    val url: String? = null,
    val uri: String? = null,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime? = null,
    val lastFetchedAt: LocalDateTime? = null,
    val bannerUrl: String? = null,
    val bannerBlurhash: String? = null,
    val bannerColor: String? = null,
    val isLocked: Boolean,
    val isSilenced: Boolean,
    val isSuspended: Boolean,
    val description: String? = null,
    val location: String? = null,
    val birthday: String? = null,
    val lang: String? = null,
    val fields: List<Field>,
    val followersCount: Int,
    val followingCount: Int,
    val notesCount: Int,
    val pinnedNoteIds: List<String>,
    val pinnedNotes: List<Note>,
    val pinnedPageId: String? = null,
    val pinnedPage: Page? = null,
    val publicReactions: Boolean,
    val twoFactorEnabled: Boolean = false,
    val usePasswordLessLogin: Boolean = false,
    val securityKeys: Boolean = false,
    val isFollowing: Boolean? = null,
    val isFollowed: Boolean? = null,
    val hasPendingFollowRequestFromYou: Boolean? = null,
    val hasPendingFollowRequestToYou: Boolean? = null,
    val isBlocking: Boolean? = null,
    val isBlocked: Boolean? = null,
    val isMuted: Boolean? = null,
    val avatarId: String?,
    val bannerId: String?,
    val injectFeaturedNote: Boolean? = null,
    val receiveAnnouncementEmail: Boolean? = null,
    val alwaysMarkNsfw: Boolean?,
    val autoSensitive: Boolean?,
    val carefulBot: Boolean?,
    val autoAcceptFollowed: Boolean?,
    val noCrawle: Boolean?,
    val isExplorable: Boolean,
    val isDeleted: Boolean,
    val hideOnlineStatus: Boolean,
    val hasUnreadSpecifiedNotes: Boolean,
    val hasUnreadMentions: Boolean,
    val hasUnreadAnnouncement: Boolean,
    val hasUnreadAntenna: Boolean,
    val hasUnreadChannel: Boolean,
    val hasUnreadMessagingMessage: Boolean,
    val hasUnreadNotification: Boolean,
    val hasPendingReceivedFollowRequest: Boolean,
    val integrations: Integrations,
    val mutedWords: List<List<String>>,
    val mutedInstances: List<String>,
    val mutingNotificationTypes: List<String>,
    val emailNotificationTypes: List<String>,
    val email: String? = null,
    val emailVerified: Boolean? = null,
    val securityKeysList: List<SecurityKey>,

    ) : UserDetailed()
