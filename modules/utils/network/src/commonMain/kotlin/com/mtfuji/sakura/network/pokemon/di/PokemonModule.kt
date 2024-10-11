package com.mtfuji.sakura.network.pokemon.di

import com.mtfuji.sakura.network.pokemon.PokemonRemoteDataSource
import com.mtfuji.sakura.network.pokemon.PokemonRemoteDataSourceImpl
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val pokemonApiModule = module {
    singleOf(::PokemonRemoteDataSourceImpl).bind<PokemonRemoteDataSource>()
}