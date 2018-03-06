package com.company;

/**
 * Created by cvoss on 2/23/2018.
 */
public class Game {
    int difficulty;
    int gameComplexity;
    public Game(){

    }
    public void GitGud(Player player){
        player.skillLevel += difficulty;
        player.wellRestedPts -= gameComplexity;
    }

    public void GoToSleep(Player player){
        player.wellRestedPts += 10;
    }
}
