package KargaBuro;

import Deck.Card;
import GameEntities.Misc.CardValidator;

public class KargaBuroCardValidity extends CardValidator{
    public boolean isValid(Card myCard, Card fromTable){
        return myCard.getSuit() == fromTable.getSuit();
    }
}
