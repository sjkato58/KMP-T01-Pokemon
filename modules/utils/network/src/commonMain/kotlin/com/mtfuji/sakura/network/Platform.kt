package com.mtfuji.sakura.network

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform