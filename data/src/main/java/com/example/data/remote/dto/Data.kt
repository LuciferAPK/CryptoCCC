package com.example.data.remote.dto

data class Data(
    val circulating_supply: Double,
    val cmc_rank: Int,
    val date_added: String,
    val id: Int,
    val last_updated: String,
    val max_supply: Long,
    val name: String,
    val num_market_pairs: Int,
    val platform: Platform,
    val quote: Quote,
    val self_reported_circulating_supply: Double,
    val self_reported_market_cap: Double,
    val slug: String,
    val symbol: String,
    val tags: List<String>,
    val total_supply: Double,
    val tvl_ratio: Double
) {
    override fun toString(): String {
        return "Data(circulating_supply=$circulating_supply, cmc_rank=$cmc_rank, date_added='$date_added', " +
                "id=$id, last_updated='$last_updated', max_supply=$max_supply, name='$name', num_market_pairs=$num_market_pairs, " +
                "platform=$platform, quote=$quote, self_reported_circulating_supply=$self_reported_circulating_supply, " +
                "self_reported_market_cap=$self_reported_market_cap, slug='$slug', symbol='$symbol', tags=$tags, " +
                "total_supply=$total_supply, tvl_ratio=$tvl_ratio)"
    }
}