package com.example.data.remote.dto

data class CoinsDTO(
    val `data`: List<Data>,
    val status: Status
) {
    override fun toString(): String {
        return "CoinsDTO(`data`=$`data`, status=$status)"
    }
}