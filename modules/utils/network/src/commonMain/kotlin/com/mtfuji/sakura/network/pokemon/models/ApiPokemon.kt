package com.mtfuji.sakura.network.pokemon.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ApiPokemon(
    @SerialName("name")
    val name: String,
    @SerialName("url")
    val url: String
)
