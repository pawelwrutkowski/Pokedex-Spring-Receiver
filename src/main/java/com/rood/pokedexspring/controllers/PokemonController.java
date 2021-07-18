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

    @PostMapping
    public void create(@RequestBody Pokemon pokemon) {
        pokemonService.save(pokemon);
    }

    @GetMapping("/number/{number}")
    public Pokemon getAll(@PathVariable Integer number) {
        return pokemonService.findByNumber(number);
    }

    @GetMapping("/name/{name}")
    public Pokemon getAll(@PathVariable String name) {
        return pokemonService.findByName(name);
    }
}
