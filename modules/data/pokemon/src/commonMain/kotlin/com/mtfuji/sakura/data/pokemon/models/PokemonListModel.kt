package com.mtfuji.sakura.data.pokemon.models

data class PokemonListModel(
    val count: Int,
    val next: String?,
    val previous: String?,
    val pageList: List<PokemonModel>
)
