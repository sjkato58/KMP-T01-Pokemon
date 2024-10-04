package com.mtfuji.sakura.features.creaturelookup

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform