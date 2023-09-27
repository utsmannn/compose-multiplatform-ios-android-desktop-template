package com.myapplication

import App
import DesktopApp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        DesktopApp()
    }
}