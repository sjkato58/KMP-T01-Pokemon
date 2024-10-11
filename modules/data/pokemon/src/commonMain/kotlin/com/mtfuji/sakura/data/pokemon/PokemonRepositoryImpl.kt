package com.mtfuji.sakura.data.pokemon

import com.mtfuji.sakura.data.pokemon.models.EMPTY_POKEMON_ARCHIVE
import com.mtfuji.sakura.data.pokemon.models.PokemonListArchiveModel
import com.mtfuji.sakura.network.pokemon.PokemonRemoteDataSource
import com.mtfuji.sakura.utils.common.outcome.Outcome
import kotlinx.coroutines.flow.MutableStateFlow

class PokemonRepositoryImpl(
    private val pokemonRemoteDataSource: PokemonRemoteDataSource
): PokemonRepository {

    val pokemonListArchiveModel = MutableStateFlow(EMPTY_POKEMON_ARCHIVE)

    override suspend fun fetchPokemonList(
        offset: String,
        limit: String
    ): Outcome<PokemonListArchiveModel, Throwable> {
        try {
            val response = pokemonRemoteDataSource.getPokemonList(offset, limit)

        } catch (ex: Exception) {
            ex.printStackTrace()
        }
        return Outcome.Failure(Exception())
    }
}