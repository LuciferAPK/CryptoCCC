package com.example.data.remote.rest

import com.example.data.remote.dto.CoinsDTO
import retrofit2.http.GET
import retrofit2.http.Query

interface CoinMarketCapAPI {
    //https://pro-api.coinmarketcap.com/v1/cryptocurrency/listings/latest?CMC_PRO_API_KEY=dacb002e-c2ae-4cf0-817b-a924ea4e0821
    @GET("/v1/cryptocurrency/listings/latest")
    suspend fun getCoins(@Query("CMC_PRO_API_KEY") api_key: String): List<CoinsDTO>
}