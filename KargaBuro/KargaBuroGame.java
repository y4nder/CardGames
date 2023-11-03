package KargaBuro;

import java.util.List;

import Deck.*;
import GameEntities.*;
import GameEntities.Misc.*;

public class KargaBuroGame extends GameSetup {
    private static final int STARTING_CARDS = 5;

    public KargaBuroGame(List<Player> allPlayers){
        cardDeck = new Deck();
        tableDeck = new Table();
        startingPlayer =  playerRotationAndCardSetup(STARTING_CARDS, allPlayers, Rotations.RIGHT_ROTATION);
    }

    public void KargaBuroSetup(){
        Card currentCard = tableDeck.topCard();
        playKargaBuro(startingPlayer, currentCard);
    }

    public void playKargaBuro(Player currentPlayer, Card currentCard){
        Card toThrow = currentPlayer.getPlayerAction().throwCard(currentPlayer, currentCard);
        if(toThrow != null){
            
        }
        else{

        }
    }
    
    public static void main(String[] args) {
        Player p1 = new Cpu("p1", null);
        Player p2 = new User("p2", null);
        Player p3 = new User("p3", null);

        KargaBuroGame k = new KargaBuroGame(List.of(p1, p2, p3));
        k.showAllPlayerCards();
    }

}
