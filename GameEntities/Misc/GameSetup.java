package GameEntities.Misc;

import java.util.List;
import Deck.Deck;
import GameEntities.Player;
import GameEntities.Table;

public abstract class GameSetup {
    protected Deck cardDeck;
    protected Table tableDeck;
    protected Player startingPlayer;

    protected Player playerRotationAndCardSetup(int startingCards, List<Player> allPlayers, Rotations rotation){
        cardDeck.shuffle();
        RotationSetup r = new RotationSetup();
        Player start = r.setupRotation(allPlayers, rotation);
        Player current = start;
        do{
            distributeStartingCards(current, startingCards);
            current = current.getPlayerRight();
        }while(!current.equals(start));
        
        return start;
    }

    protected void setPlayerActions(PlayerAction pAction){
        Player start =  startingPlayer;
        Player currPlayer = start;
        do{
            currPlayer.setPlayerAction(pAction);
            currPlayer = currPlayer.getPlayerRight();
        }while(!currPlayer.equals(start));
    }

    protected void distributeStartingCards(Player player, int startingCards){
        player.receiveCards(cardDeck.getCards(startingCards));

    }

    protected void showAllPlayerCards(){
        Player start =  startingPlayer;
        Player currPlayer = start;
        do{
            currPlayer.showCards();
            currPlayer = currPlayer.getPlayerRight();
        }while(!currPlayer.equals(start));
    }

    protected Player getStartingPlayer(){
        return startingPlayer;
    }


}
