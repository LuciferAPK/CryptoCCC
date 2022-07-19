package com.example.domain.repository

import com.example.data.remote.dto.CoinsDTO
import com.example.data.remote.rest.CoinMarketCapAPI
import com.example.domain.CMC_PRO_API_KEY
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinMarketCapAPI
) : CoinRepository {
    override suspend fun getCoins(): List<CoinsDTO> {
        return api.getCoins(CMC_PRO_API_KEY)
    }
}