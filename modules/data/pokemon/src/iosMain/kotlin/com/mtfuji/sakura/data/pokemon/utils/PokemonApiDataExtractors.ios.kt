package com.mtfuji.sakura.data.pokemon.utils

import platform.Foundation.NSURL

actual fun extractIdFromUrl(url: String): String? {
    val nsUrl = NSURL(string = url) ?: return null
    val pathComponents = nsUrl.pathComponents ?: return null
    return pathComponents.lastOrNull { it.isNotEmpty() }
}