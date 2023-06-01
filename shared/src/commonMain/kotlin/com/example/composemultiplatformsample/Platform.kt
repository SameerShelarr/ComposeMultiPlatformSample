package com.example.composemultiplatformsample

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform