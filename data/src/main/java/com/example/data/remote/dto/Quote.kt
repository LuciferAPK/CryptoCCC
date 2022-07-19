package com.example.data.remote.dto

data class Quote(
    val USD: USD

) {
    override fun toString(): String {
        return "Quote(USD=$USD)"
    }
}