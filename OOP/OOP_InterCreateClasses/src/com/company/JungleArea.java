package com.company;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by cvoss on 2/13/2018.
 */
public class JungleArea extends Area{

    public JungleArea() {
        super();
        type = "Jungle";
        monsterType.add(new Enemy(5, 8, 4, "Tiger"));
        monsterType.add(new Enemy(3, 6, 8, "Native"));
    }
}
