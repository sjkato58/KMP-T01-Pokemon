package com.mtfuji.sakura.kmp_t01_pokemon

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "KMP-T01-Pokemon",
    ) {
        App()
    }
}