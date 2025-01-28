package com.bor96dev.pokemonapp.domain

data class Pokemon (
    val id: Int,
    val name: String,
    val imageUrl: String,
    val types: List<String>,
    val abilities: List<String>,
    val baseExperience: Int
)