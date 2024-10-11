package com.mtfuji.sakura.network.pokemon

import com.mtfuji.sakura.network.LIMIT
import com.mtfuji.sakura.network.OFFSET
import com.mtfuji.sakura.network.pokemon.models.ApiPokemonResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.parameter

class PokemonRemoteDataSourceImpl(
    private val httpClient: HttpClient
): PokemonRemoteDataSource {
    override suspend fun getPokemonList(
        offset: String,
        limit: String
    ): ApiPokemonResponse {
        val response = httpClient.get(
            urlString = POKEMON_LIST_API
        ) {
            parameter(OFFSET, offset)
            parameter(LIMIT, limit)
        }
        return response.body<ApiPokemonResponse>()
    }
}