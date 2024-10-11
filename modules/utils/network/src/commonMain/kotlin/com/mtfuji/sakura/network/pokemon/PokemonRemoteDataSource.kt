package com.mtfuji.sakura.network.pokemon

import com.mtfuji.sakura.network.pokemon.models.ApiPokemonResponse

interface PokemonRemoteDataSource {
    suspend fun getPokemonList(offset: String, limit: String): ApiPokemonResponse
}