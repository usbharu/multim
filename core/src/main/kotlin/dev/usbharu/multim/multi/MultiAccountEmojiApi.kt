package dev.usbharu.multim.multi

import com.github.michaelbull.result.Result
import com.github.michaelbull.result.flatMap
import com.github.michaelbull.result.map
import dev.usbharu.multim.api.EmojiApi
import dev.usbharu.multim.error.MultiMError
import dev.usbharu.multim.error.MultiMResult
import dev.usbharu.multim.model.Emoji

class MultiAccountEmojiApi(val multiAccountApiBase: MultiAccountApiBase) : EmojiApi {
    override suspend fun get(name: String): MultiMResult<Emoji> {
        return getImpl2(name) { get(it) }.flatMap { it.first }
    }

    override suspend fun findByName(name: String): MultiMResult<List<Emoji>> {
        return getImpl2(name) { findByName(it) }.flatMap { it.first }
    }

    suspend fun get(name: MultiAccountData<String>): MultiMResult<MultiAccountData<Emoji>> {
        return getImpl(name) { get(it) }
    }

    suspend fun findByName(name: MultiAccountData<String>): MultiMResult<MultiAccountData<List<Emoji>>> {
        return getImpl(name) { findByName(it) }
    }

    private suspend fun <T, R> getImpl(
        apiData: MultiAccountData<T>,
        callback: suspend EmojiApi.(T) -> Result<R, MultiMError>
    ): Result<MultiAccountData<R>, MultiMError> {
        return emojiApi(apiData)
            .flatMap { callback(it, apiData.innerData) }
            .map { MultiAccountDataImpl(it, apiData.hashCode) }
    }

    private suspend fun <T, R> getImpl2(
        apiData: T,
        callback: suspend EmojiApi.(T) -> R
    ): Result<Pair<R, Int>, MultiMError> {
        return emojiApi(apiData)
            .map { callback(it, apiData) }
            .map {
                it to ((apiData as? MultiAccountData<*>)?.hashCode
                    ?: multiAccountApiBase.mainClientHashCode!!)
            }
    }

    private fun <T> emojiApi(id: T): Result<EmojiApi, MultiMError> {
        return multiAccountApiBase.getImpl((id as? MultiAccountData<*>)?.hashCode)
            .map { it.emojiApi }
    }
}