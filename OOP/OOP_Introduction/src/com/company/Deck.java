package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
    private ArrayList<Card> remainingCards;
    private ArrayList<Card> discardPile;
    Random rand;
    /// <summary>
    /// Creates a New Deck this deck will not be shuffled
    /// </summary>
    public Deck()
    {
        rand = new Random();
        remainingCards = new ArrayList<>();
        discardPile = new ArrayList<>();
        InitialzeDeck();

    }
    /// <summary>
    /// returns number of cards remaing on the deck
    /// </summary>
    /// <returns></returns>
    public int GetNumCardsDeck()
    {
        return remainingCards.size();
    }
    /// <summary>
    /// return number of cards total in the deck and discard pile
    /// </summary>
    /// <returns></returns>
    public int GetNumCardsTotal()
    {
        return remainingCards.size() + discardPile.size();
    }
    /// <summary>
    /// removes the top card from the deck and return that card if the deck is empty it will shuffle
    /// the discard pile into the deck then return the top card, If no cards are present it will return
    /// a card with value 0 and a null suit value
    /// </summary>
    /// <returns></returns>
    public Card DrawCard()
    {
        Card topCard = new Card(0,"null");// pass in invalid values to make sure that can detect if deck is empty
        if (remainingCards.size() != 0)
        {
            topCard = remainingCards.get(0);
            remainingCards.remove(0);
        }
        else if (discardPile.size() !=0)
        {
            ShuffleAll();
        }
        return topCard;
    }

    /// <summary>
    /// adds the card to the discard pile
    /// </summary>
    /// <param name="card"></param>
    public void DiscardCard(Card card)
    {
        discardPile.add(card);
    }

    /// <summary>
    /// Adds the card to the bottom of the deck
    /// </summary>
    /// <param name="card"></param>
    public void AddCardToDeck(Card card)
    {
        remainingCards.add(card);
    }

    /// <summary>
    /// Shuffles all of the remaining cards in the deck
    /// </summary>
    public void ShuffleRemaining()
    {
        //this works by going through each card in the list and chosing another card at random to swap places with
        int shuffleNumber = remainingCards.size();
        while (shuffleNumber > 1)
        {
            int randNum = rand.nextInt(remainingCards.size()-1);
            shuffleNumber--;
            Card shuffledCard = remainingCards.get(randNum);
            remainingCards.set(randNum,remainingCards.get(shuffleNumber));
            remainingCards.set(shuffleNumber, shuffledCard);
        }
    }

    /// <summary>
    /// Puts all of the cards in the discardPile back into the deck and shuffles.
    /// </summary>
    public void ShuffleAll()
    {
        for (int i = 0; i<discardPile.size(); i++)
        {
            remainingCards.add(discardPile.get(i));
        }
        discardPile.clear();
        ShuffleRemaining();
    }

    /// <summary>
    /// Resets the deck to a new shuffled deck
    /// </summary>
    public void ResetAndShuffle()
    {
        ClearDeck();
        InitialzeDeck();
        ShuffleRemaining();
    }

    /// <summary>
    /// this will remove all cards from the deck and discard Pile
    /// </summary>
    public void ClearDeck()
    {
        remainingCards.clear();
        discardPile.clear();
    }

    /// <summary>
    /// used to set all of the cards in a deck
    /// </summary>
    private void InitialzeDeck ()
    {
        //create  an array to hold the 4 suit Strings
        String[] suitArray = new String[] { "spades", "hearts", "clubs", "diamonds" };
        //use nested for loops to add all of the cards to the list
        for (int suitCount = 0; suitCount < 4; suitCount++)
        {
            for (int value = 2; value < 15; value++)
            {
                remainingCards.add(new Card(value, suitArray[suitCount]));
            }
        }
    }
}
