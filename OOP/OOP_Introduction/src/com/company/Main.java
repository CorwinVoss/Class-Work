package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //create 2 new objects of the Deck Class- Call One Player1 and the other Player2
        //create a list of Cards called cardsInPlay
        //shuffle player1's deck
        //clear player2's deck
        //remove 26 cards from player1's deck and add them to player2's deck

        //Do the following until one of the players have 0 cards in Discard pile or deck
        //draw card from player1 add to cardsInPlay list
        //draw card from player2
        //while last card drawn values match
        // draw 4 more cards(or as many that the player has) from player1 and player2 and add to cardsInPlay
        //Add all cards in the cardsInPlay list to the player's discard pile who had the higher value card

        Deck Player1 = new Deck(); // grab Deck
        Deck Player2 = new Deck(); // grab Deck

        ArrayList<Card> cardsInPlay = new ArrayList<>(); // cards that are in play

        Player1.ResetAndShuffle(); // shuffles Player1's cards
        Player2.ClearDeck(); // Player2 has no deck

        for (int i = 0; i < 26; i++) {
            Player2.AddCardToDeck(Player1.DrawCard()); // cuts the deck in half and gives it to player 2
        }
        while (Player1.DrawCard() != null || Player2.DrawCard() != null || Player1.DrawCard().GetValue() != 0 || Player2.DrawCard().GetValue() != 0) { // While there is a card and the card value isnt equal to zero
            cardsInPlay.add(Player1.DrawCard()); // Player1 plays card
            cardsInPlay.add(Player2.DrawCard()); // Player2 plays card
            System.out.println(cardsInPlay.get(0).GetValue()); // Flips card
            System.out.println(cardsInPlay.get(1).GetValue()); // Flips card
            if (cardsInPlay.get(0).GetValue() > cardsInPlay.get(1).GetValue()){ // If Player1's card is greater than Player2's card, adds both card to Player1's deck
                Player1.AddCardToDeck(cardsInPlay.get(0));
                Player1.AddCardToDeck(cardsInPlay.get(1));
            }
            else{ // If Player2's card is greater than Player1's card, adds both card to Player2's deck
                Player2.AddCardToDeck(cardsInPlay.get(0));
                Player2.AddCardToDeck(cardsInPlay.get(1));
            }
            if (cardsInPlay.get(0).GetValue() == cardsInPlay.get(1).GetValue()) { // If both players' cards are equal, both players draw new cards
                for (int i = 0; i < 4; i++) {
                    cardsInPlay.add(Player1.DrawCard());
                    cardsInPlay.add(Player2.DrawCard());
                }

            }
        }
    }
}