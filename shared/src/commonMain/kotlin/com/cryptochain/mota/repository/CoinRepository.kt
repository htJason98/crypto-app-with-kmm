package com.cryptochain.mota.repository

import com.cryptochain.mota.api.CoingeckoApi
import com.cryptochain.mota.model.CoinResponse
import com.cryptochain.mota.service.CoinService

class CoinRepository(
    private val coinService: CoinService
) : CoingeckoApi {
    override suspend fun getCoinList(perPage: Int, page: Int): List<CoinResponse> {
        return coinService.getCoinList(perPage, page)
    }
}