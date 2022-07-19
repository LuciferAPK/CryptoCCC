package com.example.domain.transform

import com.example.data.remote.dto.CoinsDTO
import com.example.data.remote.dto.Data
import com.example.domain.model.Coin

fun Data.toData() = Coin(id, name, symbol, cmc_rank, date_added)

fun CoinsDTO.toCoin() : List<Coin> {
    val dataCoin = mutableListOf<Coin>()
    for (d in data) {
        dataCoin.add(d.toData())
    }
    return dataCoin
//    data.map { it.toData() }
//    status
}