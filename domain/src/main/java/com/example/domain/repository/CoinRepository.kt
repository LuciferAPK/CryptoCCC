package com.example.domain.repository

import com.example.data.remote.dto.CoinsDTO

interface CoinRepository {
    suspend fun getCoins(): List<CoinsDTO>
}