package com.rood.pokedexspring.pokemon;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "pokemons")
public class Pokemon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true)
    private int number;
    @Column(unique = true)
    private String name;
    @NotNull
    private String primaryType;
    @Nullable
    private String secondaryType;
    private int hp;
    private int attack;
    private int defense;
    private int specialAttack;
    private int specialDefense;
    private int speed;
    @OneToOne
    @Nullable
    private Pokemon subForm;
    private String description;

    public Pokemon(int number, String name, String primaryType, @Nullable String secondaryType, int hp, int attack, int defense, int specialAttack, int specialDefense, int speed, @Nullable Pokemon subForm, String description) {
        this.number = number;
        this.name = name;
        this.primaryType = primaryType;
        this.secondaryType = secondaryType;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.specialAttack = specialAttack;
        this.specialDefense = specialDefense;
        this.speed = speed;
        this.subForm = subForm;
        this.description = description;
    }

    public Pokemon() {
    }

    public Integer getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getPrimaryType() {
        return primaryType;
    }

    @Nullable
    public String getSecondaryType() {
        return secondaryType;
    }

    public int getHp() {
        return hp;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getSpecialAttack() {
        return specialAttack;
    }

    public int getSpecialDefense() {
        return specialDefense;
    }

    public int getSpeed() {
        return speed;
    }

    @Nullable
    public Pokemon getSubForm() {
        return subForm;
    }

    public String getDescription() {
        return description;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrimaryType(String primaryType) {
        this.primaryType = primaryType;
    }

    public void setSecondaryType(@Nullable String secondaryType) {
        this.secondaryType = secondaryType;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setSpecialAttack(int specialAttack) {
        this.specialAttack = specialAttack;
    }

    public void setSpecialDefense(int specialDefense) {
        this.specialDefense = specialDefense;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setSubForm(@Nullable Pokemon subForm) {
        this.subForm = subForm;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
