package com.rood.pokedexspring.pokemon;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonService {
    private PokemonRepository pokemonRepository;

    public PokemonService(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    public List<Pokemon> findAll() {
        return pokemonRepository.findAll();
    }

    public Pokemon findByNumber(Integer number) {
        return pokemonRepository.getPokemonByNumber(number);
    }
    public Pokemon findByName(String name) {
        return pokemonRepository.getPokemonByName(name);
    }

    public Pokemon save(Pokemon pokemon) {
        return pokemonRepository.save(pokemon);
    }
}
