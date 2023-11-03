package GameEntities;

import Deck.Card;
import GameEntities.Misc.PlayerAction;

public class Cpu extends Player{

    public Cpu(String name, PlayerAction pAction) {
        super(name, pAction);
    }

    @Override
    public Card chooseCard() {
        for(Card myCard : playerCards){
            if(pAction.getCardValidator().isValid(myCard, myCard)){
                return myCard;
            }
        }
        return null;
    }
    
}
