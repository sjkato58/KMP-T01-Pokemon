package com.mtfuji.sakura.data.pokemon.utils

import java.net.URI

actual fun extractIdFromUrl(url: String): String? {
    val segments = URI(url).path.split("/")
    return segments.lastOrNull { it.isNotEmpty() }
}