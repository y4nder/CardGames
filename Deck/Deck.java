package Deck;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import Deck.CardAttribute.*;
import Deck.CardTypes.*;

public class Deck {
    private Deque<Card> cardDeck;

    //constructor
    public Deck(){
        this.cardDeck = new ArrayDeque<>();                             //initialize deque
        generateStandardCards();
        generateJokerCards();
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

    //generator methods
    private void generateStandardCards(){
        for(Suit suit : Suit.values()){

            cardDeck.add(new FaceCard(suit, Face.ACE));                 //generate fthe ACE card for each suit
            
            for(int i = 2; i <= 10; i++)
                cardDeck.add(new NumberCard(suit, i));                  //generate the number cards for each suit

            for(Face face : Face.values()){                             //generate the face cards for each suit
                if(face != Face.ACE && face != Face.Joker)
                    cardDeck.add(new FaceCard(suit, face));
            }
        }

    }

    private void generateJokerCards(){                                  //generate 2 joker cards
        for(int i = 0; i < 2; i++){
            cardDeck.add(new JokerCard());
        }
    }
}
