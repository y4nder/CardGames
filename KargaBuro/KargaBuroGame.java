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
        rotator = new RightRotator();   
    }

    public void KargaBuroSetup(){
        Card currentCard = cardDeck.drawOne();
        tableDeck.addToTableDeck(currentCard);
        playKargaBuro(startingPlayer, currentCard);
    }

    public void playKargaBuro(Player startingPlayer, Card startingCard){
        Player currentPlayer = startingPlayer;
        Card currentCard = startingCard;
        boolean gameFinished = false;
        while(!gameFinished){
            System.out.println("\n---------------------------------------");
            System.out.println(currentPlayer.getName() + "'s turn");
            System.out.println("top card is " + tableDeck.topCard().toString());
            Card toThrow = currentPlayer.getPlayerAction().throwCard(currentPlayer, currentCard);
            if(toThrow != null){
                if(currentPlayer.hasNoCardsLeft()){
                    System.out.println(currentPlayer.getName() + " won!");
                    gameFinished = true;
                }
                currentCard = toThrow;
                tableDeck.addToTableDeck(currentCard);
                currentPlayer = rotator.rotate(currentPlayer);
            }
            else{
                System.out.println(currentPlayer.getName() + " will draw one");
                currentPlayer.receiveCards(currentPlayer.getPlayerAction().drawCard(1, cardDeck));
            }
        }
    }
    
    public static void main(String[] args) {
        Player p1 = new User("p1", new KargaBuroActions());
        Player p2 = new User("p2", new KargaBuroActions());
        Player p3 = new Cpu("p3", new KargaBuroActions());

        KargaBuroGame k = new KargaBuroGame(List.of(p1, p2, p3));
        
        k.KargaBuroSetup();
    }

}
