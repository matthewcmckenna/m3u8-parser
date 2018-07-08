package com.matthewcmckenna.github.m3u8.model.tag

sealed class Master {
    object Version: Master()
    object Media : Master()
    object StreamInf : Master()
    object IFrameStreamInf : Master()
    object SessionData : Master()
    object SessionKey : Master()
    object IndependentSegments : Master()
    object Start : Master()
}
