package dev.usbharu.multim.misskey.v12.common

import dev.usbharu.multim.model.common.StatusId

class MisskeyStatusId(val id: String, private val url: String) : StatusId() {
    override fun equals(other: Any?): Boolean {
        return true
    }

    override fun hashCode(): Int {
        return 0
    }

    override fun getUrl(): String {
        return url
    }
}