package com.mtfuji.sakura.kmp_t01_pokemon

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform