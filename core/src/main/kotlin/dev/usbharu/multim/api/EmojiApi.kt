package dev.usbharu.multim.api

import com.github.michaelbull.result.Err
import dev.usbharu.multim.error.ErrorType
import dev.usbharu.multim.error.MultiMError
import dev.usbharu.multim.error.MultiMResult
import dev.usbharu.multim.model.Emoji

interface EmojiApi {
    suspend fun get(name:String):MultiMResult<Emoji>

    suspend fun findByName(name:String):MultiMResult<List<Emoji>>
}

object NotImplEmojiApi : EmojiApi {
    override suspend fun get(name: String): MultiMResult<Emoji> {
        return Err(MultiMError("emoji get not implements",null, ErrorType.NOT_IMPL))
    }

    override suspend fun findByName(name: String): MultiMResult<List<Emoji>> {
        return Err(MultiMError("emoji findByName not implements",null,ErrorType.NOT_IMPL))
    }
}
