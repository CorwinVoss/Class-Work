package com.company;

/**
 * Created by cvoss on 2/27/2018.
 */
public class Entity {
    int health;
    int strength;
    int defence;

    public Entity(int Health, int Strength, int Defence){
        health = Health;
        strength = Strength;
        defence = Defence;
    }

    public void TakeDamage(Entity entity){
        health -= (entity.strength - defence);
    }
}
