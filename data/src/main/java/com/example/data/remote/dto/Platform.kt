package com.example.data.remote.dto

data class Platform(
    val id: Int,
    val name: String,
    val slug: String,
    val symbol: String,
    val token_address: String

) {
    override fun toString(): String {
        return "Platform(id=$id, name='$name', slug='$slug', symbol='$symbol', token_address='$token_address')"
    }
}