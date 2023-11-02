package Deck.CardTypes;

import Deck.CardAttribute.Suit;

public class NumberCard extends Card{

    private final int value;

    public NumberCard(Suit suite, int value) {
        super(suite);
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    @Override
    public String toString() {
        return value + " of " + getSuite() + "s";
    }
    
}
