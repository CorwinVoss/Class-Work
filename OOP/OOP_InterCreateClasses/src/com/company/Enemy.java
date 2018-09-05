package com.company;

/**
 * Created by cvoss on 2/13/2018.
 */
public class Enemy extends Entity{

    public Enemy(int health, int defense, int strength, String name){
        this.name = name;
        this.health = health;
        this.defense = defense;
        this.strength = strength;
    }
}
