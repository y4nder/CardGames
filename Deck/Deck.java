package Deck;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import Deck.CardAttribute.*;

public class Deck {
    private Deque<Card> cardDeck;

    //constructor
    public Deck(){
        this.cardDeck = new ArrayDeque<>();                             //initialize deque
        generateStandardCards();
    }

    //generator methods
    private void generateStandardCards(){
        for(Suits suit : Suits.values()){
            for(Values value : Values.values()){
                cardDeck.add(new Card(suit, value));
            }
        }

    }
    
    //method
    public List<String> allCards(){
        List<String> deck = new ArrayList<>();
        deck.add("Card count: " + cardDeck.size() + "\n");
        for(Card card : cardDeck){
            deck.add(card.toString() + "\n");
        }
        return deck;
    }


    public List<Card> getCards(int howMany){
        List<Card> drawnCards = new ArrayList<>();
        for(int i = 0; i < howMany; i++){
            drawnCards.add(cardDeck.pollLast());
        }
        return drawnCards;
    }

    public boolean cardDeckIsEmpty(){
        return cardDeck.size() == 0;
    }

    public boolean cardDeckNotEnough(int howMany){
        return howMany > cardDeck.size();
    }

    public void shuffle() {
        List<Card> tempList = new ArrayList<>(cardDeck);
        Collections.shuffle(tempList);
        cardDeck = new ArrayDeque<>(tempList);
    }

    // public static void main(String[] args) {
    //     Deck d = new Deck();
    //     System.out.println(d.allCards());
    // }
}
