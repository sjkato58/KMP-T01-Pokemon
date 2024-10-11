package com.mtfuji.sakura.data.pokemon

import com.mtfuji.sakura.data.pokemon.models.PokemonListArchiveModel
import com.mtfuji.sakura.utils.common.outcome.Outcome

interface PokemonRepository {
    suspend fun fetchPokemonList(offset: String, limit: String): Outcome<PokemonListArchiveModel, Throwable>
}