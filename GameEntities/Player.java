package GameEntities;

import java.util.ArrayList;
import java.util.List;

import Deck.Card;
import GameEntities.Misc.CardValidator;
import GameEntities.Misc.PlayerAction;

public abstract class Player {
    protected String name;
    protected List<Card> playerCards;
    protected Player playerLeft;
    protected Player playerRight;
    protected PlayerAction pAction;
    protected CardValidator cValidator;
    
    public Player(String name, PlayerAction pAction){
        this.name = name;
        this.playerCards = new ArrayList<>();
        this.playerLeft = null;
        this.playerRight = null;
        this.pAction = pAction;
        this.cValidator = this.pAction.getCardValidator();
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
    public List<Card> getPlayerCards() {
        return playerCards;
    }

    public PlayerAction getPlayerAction(){
        return pAction;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setPlayerCards(List<Card> playerCards) {
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
        int i = 0;
        System.out.println(name + " cards");
        for(Card cards : playerCards){
            System.out.println("[" + (++i) + "]" + cards.toString());
        }
    }
    
    public abstract Card chooseCard();

    protected boolean validChoice(int choice){
        if(choice >= 0 && choice < playerCards.size()){
            return true;
        }
        System.out.println("Invalid choice");            
        return false;
    }
    
}
