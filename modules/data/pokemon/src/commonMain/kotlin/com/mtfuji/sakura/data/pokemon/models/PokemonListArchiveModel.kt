package com.mtfuji.sakura.data.pokemon.models

data class PokemonListArchiveModel(
    val currentPage: String,
    val lists: List<PokemonListModel>
)

val EMPTY_POKEMON_ARCHIVE = PokemonListArchiveModel(
    "-1", listOf()
)