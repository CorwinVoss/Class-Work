package com.company;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by cvoss on 2/22/2018.
 */
public class Area {
    String type;
    ArrayList<Enemy> monsterType;
    Random rand;

    public Enemy enemyEncounter(){
        int randInt = rand.nextInt(2);

        Enemy enemy = monsterType.get(randInt);
        return enemy;
    }
    }