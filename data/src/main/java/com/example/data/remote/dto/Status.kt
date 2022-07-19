package com.example.data.remote.dto

data class Status(
    val credit_count: Int,
    val elapsed: Int,
    val error_code: Int,
    val error_message: Any,
    val notice: Any,
    val timestamp: String,
    val total_count: Int
) {
    override fun toString(): String {
        return "Status(credit_count=$credit_count, elapsed=$elapsed, error_code=$error_code, " +
                "error_message=$error_message, notice=$notice, timestamp='$timestamp', total_count=$total_count)"
    }
}