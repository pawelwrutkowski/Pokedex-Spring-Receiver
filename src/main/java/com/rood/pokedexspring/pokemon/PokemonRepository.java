package com.rood.pokedexspring.pokemon;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonRepository extends JpaRepository <Pokemon, Integer> {

    public Pokemon getPokemonByNumber(Integer number);

    public Pokemon getPokemonByName(String name);
}
