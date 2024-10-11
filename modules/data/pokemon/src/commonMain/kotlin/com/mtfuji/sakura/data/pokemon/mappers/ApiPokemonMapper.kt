package com.mtfuji.sakura.data.pokemon.mappers

import com.mtfuji.sakura.data.pokemon.models.PokemonListModel
import com.mtfuji.sakura.data.pokemon.models.PokemonModel
import com.mtfuji.sakura.data.pokemon.utils.extractIdFromUrl
import com.mtfuji.sakura.network.pokemon.models.ApiPokemon
import com.mtfuji.sakura.network.pokemon.models.ApiPokemonResponse
import com.mtfuji.sakura.utils.common.EMPTY

fun ApiPokemonResponse.toModel() = PokemonListModel(
    count = this.count,
    next = this.next,
    previous = this.next,
    pageList = listOf()
)

fun ApiPokemon.toModel() = PokemonModel(
    name = this.name,
    imageUrl = "",
    number = extractIdFromUrl(this.url) ?: String.EMPTY
)