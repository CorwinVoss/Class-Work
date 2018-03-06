package com.company;

/**
 * Created by cvoss on 2/23/2018.
 */
public class RTS extends Game {
    public RTS(){
        difficulty = 3;
        gameComplexity = 5;
    }
    public void PracticeMicro(Player player){
        player.skillLevel += 1;
        player.wellRestedPts -= 3;
    }
}
