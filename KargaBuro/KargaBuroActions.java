package KargaBuro;

import Deck.Card;
import GameEntities.Player;
import GameEntities.Misc.PlayerAction;

public class KargaBuroActions extends PlayerAction{
    private KargaBuroCardValidity cValidity = new KargaBuroCardValidity();
    
    @Override
    public Card throwCard(Player currentPlayer, Card fromTable) {
        Card chosenCard = currentPlayer.chooseCard(fromTable);
        if(chosenCard == null) return null;
        return chosenCard;
    }

    public KargaBuroCardValidity getCardValidator(){
        return cValidity;
    }


    
}
