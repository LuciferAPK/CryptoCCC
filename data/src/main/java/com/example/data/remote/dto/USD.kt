package com.example.data.remote.dto

data class USD(
    val fully_diluted_market_cap: Double,
    val last_updated: String,
    val market_cap: Double,
    val market_cap_dominance: Double,
    val percent_change_1h: Double,
    val percent_change_24h: Double,
    val percent_change_30d: Double,
    val percent_change_60d: Double,
    val percent_change_7d: Double,
    val percent_change_90d: Double,
    val price: Double,
    val tvl: Double,
    val volume_24h: Double,
    val volume_change_24h: Double


) {
    override fun toString(): String {
        return "USD(fully_diluted_market_cap=$fully_diluted_market_cap, last_updated='$last_updated', " +
                "market_cap=$market_cap, market_cap_dominance=$market_cap_dominance, percent_change_1h=$percent_change_1h, " +
                "percent_change_24h=$percent_change_24h, percent_change_30d=$percent_change_30d, " +
                "percent_change_60d=$percent_change_60d, percent_change_7d=$percent_change_7d, " +
                "percent_change_90d=$percent_change_90d, price=$price, tvl=$tvl, volume_24h=$volume_24h, " +
                "volume_change_24h=$volume_change_24h)"
    }
}