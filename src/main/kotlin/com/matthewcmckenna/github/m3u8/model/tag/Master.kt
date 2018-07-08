package com.matthewcmckenna.github.m3u8.model.tag

sealed class Master {
    data class Version(val number: Int) : Master()

    data class Media(
            val type: String,
            val uri: String?,
            val groupId: String,
            val language: String?,
            val assocLanguage: String?,
            val name: String,
            val default: String?,
            val autoselect: String?,
            val forced: String?,
            val instreamId: String?,
            val characteristics: String?,
            val channels: String?
    ) : Master()

    data class StreamInf(
            val bandwith: Int,
            val averageBandwith: Int?,
            val codecs: String?,
            val resolution: String?,
            val frameRate: Float?,
            val hdcpLevel: String?,
            val audio: String?,
            val video: String?,
            val subtitles: String?,
            val closedCaptions: String?
    ) : Master()

    data class IFrameStreamInf(val uri: String) : Master()

    data class SessionData(
            val dataId: String,
            val value: String?,
            val uri: String?,
            val language: String?
    ) : Master()

    /**
     * @param method
     * @param uri a quoted-string containing a URI that specifies how to obtain the key
     * @param initVector a hexadecimal-sequence that specifies a 128-bit unsigned integer
     * @param keyFormat a quoted-string that specifies how the key is represented in the resource identified by the URI
     * @param keyFormatVersions a quoted-string containing one or more positive integers separated by the "/" character
     */
    data class SessionKey(
            val method: String,
            val uri: String,
            val initVector: String,
            val keyFormat: String,
            val keyFormatVersions: String
    ) : Master()

    object IndependentSegments : Master()

    data class Start(
            val timeOffset: Float,
            val precise: String?
    ) : Master()
}
