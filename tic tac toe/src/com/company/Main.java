package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Board board = new Board(3, 3);
        Player playerOne = new Player();
        Player playerTwo = new Player();
        playerOne.setShape("X");
        playerTwo.setShape("O");

        for (int i = 0; i <= (board.width * board.length); i++){

        }
    }
}
