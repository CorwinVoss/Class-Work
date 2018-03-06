package com.company;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by cvoss on 2/13/2018.
 */
public class FrostArea extends Area {

    public FrostArea() {
        type = "Frost";
        Random rand = new Random();
        monsterType = new ArrayList();
        monsterType.add(new Enemy(1,0,0,"Snowman"));
        monsterType.add(new Enemy(8,4,5,"Yeti"));

    }
}
