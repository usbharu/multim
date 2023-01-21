package dev.usbharu.multim.model.common.impl.misskey

import dev.usbharu.multim.model.common.Relation

class MisskeyRelation(
    myself: MisskeyAccount,
    other: MisskeyAccount,
    following: Boolean,
    follower: Boolean,
    mute: Boolean,
    block: Boolean
) : Relation(myself, other, following, follower, mute, block)