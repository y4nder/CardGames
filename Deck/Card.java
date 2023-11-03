package Deck;

import Deck.CardAttribute.Suits;
import Deck.CardAttribute.Values;

public class Card {
    
    private final Suits suit;
    private final Values value;

    public Card(Suits suit, Values value){
        this.suit = suit;
        this.value = value;
    }

    public Suits getSuit(){
        return suit;
    }

    protected Values getValue(){
        return value;
    }

    public String toString(){
        return value + " of " + suit + "S";
    }
}
