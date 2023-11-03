package GameEntities.Misc;

import GameEntities.Player;

public class LeftRotator implements Rotator{

    @Override
    public Player rotate(Player currentPlayer) {
        return currentPlayer.getPlayerLeft();
    }
    
}