package Deck;

import Deck.CardAttribute.Suit;

public abstract class Card {
    
    private final Suit suite;

    public Card(Suit suite){
        this.suite = suite;
    }

    protected Suit getSuite(){
        return suite;
    }

    public abstract String toString();
}
