package com.bor96dev.pokemonapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.bor96dev.pokemonapp.ui.ListScreen
import com.bor96dev.pokemonapp.ui.fakePokemonList
import com.bor96dev.pokemonapp.ui.theme.PokemonAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PokemonAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ListScreen(
                        pokemons = fakePokemonList,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
