package dev.usbharu.multim.multi

import dev.usbharu.multim.MultiM
import dev.usbharu.multim.ServiceInfo
import dev.usbharu.multim.api.createHttpClient
import dev.usbharu.multim.factory.MultiMApis
import dev.usbharu.multim.factory.ServiceInfoFactory

class MultiAccountApiBase(val serviceList: List<ServiceInfo>) {

    val factory = ServiceInfoFactory(serviceList)

    val httpClient = createHttpClient()

    val apiClientMap = mutableMapOf<Int, MultiMApis>()
    suspend fun addAccount(url: String, token: String): Int {
        val hashCode = (url + token).hashCode()
        apiClientMap[hashCode] =
            MultiM.createClient(url, token, factory, httpClient)
        return hashCode
    }

    fun getImpl(hashCode:Int):MultiMApis{
        return apiClientMap.getValue(hashCode)
    }
}
