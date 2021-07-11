package com.rood.pokedexspring.controllers;

import com.rood.pokedexspring.pokemon.Pokemon;
import com.rood.pokedexspring.pokemon.PokemonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/pokemon")
public class PokemonController {
private PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping
    public List<Pokemon> getAll() {
        return pokemonService.findAll();
    }

    @PostMapping("/add")
    public Pokemon create(@RequestBody Pokemon pokemon) {
        return pokemonService.save(pokemon);
    }

}
