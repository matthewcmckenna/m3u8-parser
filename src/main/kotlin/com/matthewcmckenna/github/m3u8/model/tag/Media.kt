package com.matthewcmckenna.github.m3u8.model.tag

sealed class Media {
    object Version : Media()
    object TargetDuration : Media()
    object MediaSequence : Media()
    object DiscontinuitySequencce : Media()
    object EndList : Media()
    object PlaylistType : Media()
    object IFramesOnly : Media()
    object IndependentSegments : Media()
    object Start : Media()

    sealed class Segment {
        object ByteRange : Segment()
        object DateRange : Segment()
        object Discontinuity : Segment()
        object Inf : Segment()
        object Key : Segment()
        object Map : Segment()
        object ProgramDateTime : Segment()
        object SegmentTag : Segment()
    }
}
