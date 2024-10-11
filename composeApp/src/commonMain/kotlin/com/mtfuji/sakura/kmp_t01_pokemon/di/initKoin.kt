package com.mtfuji.sakura.kmp_t01_pokemon.di

import com.mtfuji.sakura.network.pokemon.di.pokemonApiModule
import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration

fun initKoin(config: KoinAppDeclaration? = null)  {
    startKoin {
        config?.invoke(this)
        modules(
            pokemonApiModule
        )
    }
}