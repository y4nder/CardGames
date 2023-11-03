package GameEntities.Misc;

import GameEntities.Player;

public class RightRotator implements Rotator{

    @Override
    public Player rotate(Player currentPlayer) {
        return currentPlayer.getPlayerRight();
    }
    
}
