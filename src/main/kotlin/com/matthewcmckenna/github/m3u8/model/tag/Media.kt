package com.matthewcmckenna.github.m3u8.model.tag

sealed class Media {
    object EXTM3U : Media()

    data class Version(val number: Int) : Media()

    data class TargetDuration(val duration: Int) : Media()

    data class MediaSequence(val number: Int = 0) : Media()

    data class DiscontinuitySequencce(val number: Int = 0) : Media()

    object EndList : Media()

    data class PlaylistType(val type: String) : Media()

    object IFramesOnly : Media()

    object IndependentSegments : Media()

    data class Start(val timeOffset: Float, val precise: String) : Media()

    sealed class Segment {
        data class Inf(val duration: Float, val title: String) : Segment()

        /**
         * @param  range in as `n@o`
         */
        data class ByteRange(val range: String) : Segment()

        object Discontinuity : Segment()

        /**
         * @param method
         * @param uri a quoted-string containing a URI that specifies how to obtain the key
         * @param initVector a hexadecimal-sequence that specifies a 128-bit unsigned integer
         * @param keyFormat a quoted-string that specifies how the key is represented in the resource identified by the URI
         * @param keyFormatVersions a quoted-string containing one or more positive integers separated by the "/" character
         */
        data class Key(
                val method: String,
                val uri: String,
                val initVector: String,
                val keyFormat: String,
                val keyFormatVersions: String
        ) : Segment()

        data class Map(val uri: String, val byteRange: ByteRange?) : Segment()

        data class ProgramDateTime(val date: String) : Segment()

        data class DateRange(
                val id: String,
                val clazz: String?,
                val startDate: String,
                val endDate: String?,
                val duration: Float?,
                val plannedDuration: Float?,
                val x_client: List<String?>?,
                val endOnNext: String?
        ) : Segment()

        object SegmentTag : Segment()
    }
}
