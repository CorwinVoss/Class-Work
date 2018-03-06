package com.company;

/**
 * Created by cvoss on 2/23/2018.
 */
public class MOBA extends Game {
    public MOBA(){
        difficulty = 2;
        gameComplexity = 4;
    }

    public void PlaySolo(Player player){
        player.skillLevel += 1;
        player.wellRestedPts -= 3;
    }
    public void PlayArranged(Player player){
        player.skillLevel += 2;
        player.wellRestedPts -= 5;
    }
}
