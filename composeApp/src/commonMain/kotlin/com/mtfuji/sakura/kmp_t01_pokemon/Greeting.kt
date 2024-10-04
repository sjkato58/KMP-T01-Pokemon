package com.mtfuji.sakura.kmp_t01_pokemon

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}