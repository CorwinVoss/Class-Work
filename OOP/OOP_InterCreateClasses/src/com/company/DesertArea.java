package com.company;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by cvoss on 2/13/2018.
 */
public class DesertArea extends Area{

    public DesertArea() {
        type = "Desert";
        Random rand = new Random();
        monsterType = new ArrayList();
        monsterType.add(new Enemy (5, 7, 3, "Spider"));
        monsterType.add(new Enemy(5, 5, 4, "Snake"));
    }
}
