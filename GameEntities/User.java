package GameEntities;

import Deck.Card;
import GameEntities.Misc.PlayerAction;

public class User extends Player{

    public User(String name, PlayerAction pAction) {
        super(name, pAction);
    }

    @Override
    public Card chooseCard() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'chooseCard'");
    }
    
}