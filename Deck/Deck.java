package Deck;

import java.util.ArrayDeque;
import java.util.Deque;
import Deck.CardAttribute.Face;
import Deck.CardAttribute.Suit;

public class Deck {
    private Deque<Card> cardDeck = new ArrayDeque<>();

    public Deck(){
        //generate all cards
        for(Suit suit : Suit.values()){
            cardDeck.add(new FaceCard(suit, Face.ACE));
            //generate cards with numbers
            for(int i = 2; i <= 10; i++){
                cardDeck.add(new NumberCard(suit, i));  
            }
            //generate cards with faces
            for(Face face : Face.values()){
                if(face == Face.Joker || face == Face.ACE) continue;
                else cardDeck.add(new FaceCard(suit, face));
            }
        }

        //generate joker cards
        for(int i = 0; i < 2; i++){
            cardDeck.add(new JokerCard());
        }
    }

    public void viewDeck(){
        System.out.println("Card count: " + cardDeck.size());
        for(Card card : cardDeck){
            System.out.println(card.toString());
        }
    }
}
