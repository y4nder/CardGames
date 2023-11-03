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
        Card currentCard = cardDeck.drawOne();
        tableDeck.addToTableDeck(currentCard);
        playKargaBuro(startingPlayer, currentCard);
    }

    public void playKargaBuro(Player currentPlayer, Card currentCard){
        System.out.println("top card is " + tableDeck.topCard().toString());
        Card toThrow = currentPlayer.getPlayerAction().throwCard(currentPlayer, currentCard);
        if(toThrow != null){

        }
        else{

        }
    }
    
    public static void main(String[] args) {
        Player p1 = new User("p1", new KargaBuroActions());
        Player p2 = new User("p2", new KargaBuroActions());
        Player p3 = new User("p3", new KargaBuroActions());

        KargaBuroGame k = new KargaBuroGame(List.of(p1, p2, p3));
        
        k.KargaBuroSetup();
    }

}
