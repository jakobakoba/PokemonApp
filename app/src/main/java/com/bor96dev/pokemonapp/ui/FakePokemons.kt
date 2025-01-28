package com.bor96dev.pokemonapp.ui

import com.bor96dev.pokemonapp.domain.Pokemon

val fakePokemonList = listOf(
    Pokemon(
        id = 1,
        name = "Bulbasaur",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png",
        types = listOf("Grass", "Poison"),
        abilities = listOf("Overgrow", "Chlorophyll"),
        baseExperience = 64
    ),
    Pokemon(
        id = 2,
        name = "Charmander",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/4.png",
        types = listOf("Fire"),
        abilities = listOf("Blaze", "Solar Power"),
        baseExperience = 62
    ),
    Pokemon(
        id = 3,
        name = "Squirtle",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/7.png",
        types = listOf("Water"),
        abilities = listOf("Torrent", "Rain Dish"),
        baseExperience = 63
    ),
    Pokemon(
        id = 4,
        name = "Pikachu",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/25.png",
        types = listOf("Electric"),
        abilities = listOf("Static", "Lightning Rod"),
        baseExperience = 112
    ),
    Pokemon(
        id = 5,
        name = "Jigglypuff",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/39.png",
        types = listOf("Normal", "Fairy"),
        abilities = listOf("Cute Charm", "Competitive"),
        baseExperience = 95
    )
)