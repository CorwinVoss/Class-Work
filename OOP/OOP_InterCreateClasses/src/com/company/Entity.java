package com.company;

/**
 * Created by cvoss on 2/27/2018.
 */
public class Entity {
    int health;
    int strength;
    int defense;
    String name;

    public void TakeDamage(Entity entity){
        health -= (entity.strength - defense);
    }
}
