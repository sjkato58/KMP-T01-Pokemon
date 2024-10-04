package com.mtfuji.sakura.data.pokemon

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform