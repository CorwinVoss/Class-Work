package com.company;
/**
 * Created by cvoss on 2/13/2018.
 */
public class Character extends Entity{
    int playerLevel = 1;
    int playerExp = 0;
    public void LevelUp(int playerLevel){
        playerLevel++;
    }
    public void Heal(int healing){
        health += healing;
    }
}
