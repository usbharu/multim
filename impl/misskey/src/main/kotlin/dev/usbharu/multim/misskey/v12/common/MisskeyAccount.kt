package dev.usbharu.multim.misskey.v12.common

import dev.usbharu.multim.model.common.Account
import dev.usbharu.multim.model.common.Avatar

class MisskeyAccount(
    val id: String,
    screenName: String,
    accountName: String,
    isBot: Boolean? = false,
    avatar: Avatar
) : Account(screenName, accountName, isBot, avatar)