package com.company;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by cvoss on 2/13/2018.
 */
public class PlainsArea extends Area{

    public PlainsArea(){
        super();
        type = "plains";
        monsterType.add(new Enemy(6, 8, 3, "Lion"));
        monsterType.add(new Enemy(10, 5 , 7,"Elephant"));
    }
}
