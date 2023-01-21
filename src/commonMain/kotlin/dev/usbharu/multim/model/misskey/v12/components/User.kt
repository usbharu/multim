package dev.usbharu.multim.model.misskey.v12.components

import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonContentPolymorphicSerializer
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.jsonObject

@Serializable(with = UserSerializer::class)
sealed class User

object UserSerializer : JsonContentPolymorphicSerializer<User>(User::class) {
    override fun selectDeserializer(element: JsonElement): DeserializationStrategy<out User> =
        when {
            "avatarId" in element.jsonObject -> UserDetailed.serializer()
            else -> UserLite.serializer()
        }
}
