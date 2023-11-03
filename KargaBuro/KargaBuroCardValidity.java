package KargaBuro;

import Deck.Card;

public class KargaBuroCardValidity {
    public boolean isValid(Card myCard, Card fromTable){
        return myCard.getSuit() == myCard.getSuit();
    }
}
