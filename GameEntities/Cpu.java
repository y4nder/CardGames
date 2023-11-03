package GameEntities;

import Deck.Card;
import GameEntities.Misc.PlayerAction;

public class Cpu extends Player{

    public Cpu(String name, PlayerAction pAction) {
        super(name, pAction);
    }

    @Override
    public Card chooseCard() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'chooseCard'");
    }
    
}
