package GameEntities;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

import Deck.Card;
import GameEntities.Misc.PlayerAction;

public abstract class Player {
    private String name;
    private Deque<Card> playerCards;
    private Player playerLeft;
    private Player playerRight;
    private PlayerAction pAction;
    
    public Player(String name, PlayerAction pAction){
        this.name = name;
        this.playerCards = new ArrayDeque<>();
        this.playerLeft = null;
        this.playerRight = null;
        this.pAction = pAction;
    }

    public Player getPlayerLeft() {
        return playerLeft;
    }    
    public Player getPlayerRight() {
        return playerRight;
    }
    
    public String getName() {
        return name;
    }
    public Deque<Card> getPlayerCards() {
        return playerCards;
    }

    public PlayerAction getPlayerAction(){
        return pAction;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setPlayerCards(Deque<Card> playerCards) {
        this.playerCards = playerCards;
    }
    public void setPlayerAction(PlayerAction pAction){
        this.pAction = pAction;
    }
    public void setPlayerLeft(Player playerLeft) {
        this.playerLeft = playerLeft;
    }

    public void setPlayerRight(Player playerRight) {
        this.playerRight = playerRight;
    }


    //methods
    public void receiveCards(List<Card> cards) {
        playerCards.addAll(cards);
    }

    public void showCards() {
        System.out.println(name + " cards");
        for(Card cards : playerCards){
            System.out.println(cards.toString());
        }
    }
    
    public abstract Card chooseCard();

}
