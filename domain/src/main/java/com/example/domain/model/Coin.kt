package com.example.domain.model

data class Coin(
    val id: Int,
    val name: String,
    val symbol: String,
    val cmc_rank: Int,
    val date_added: String
)