package dev.usbharu.multim.model

abstract class StatusId {
    abstract override fun equals(other: Any?): Boolean
    abstract override fun hashCode(): Int
    abstract fun getUrl(): String
}