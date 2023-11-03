package GameEntities;

import java.util.ArrayDeque;
import java.util.Deque;

import Deck.Card;

public class Table {
    private Deque<Card> tableDeck = new ArrayDeque<>();

    public void addToTableDeck(Card card){
        tableDeck.add(card);
    }

    public Deque<Card> returnToDeck(){
        Deque<Card> toReturn = new ArrayDeque<>(tableDeck);
        tableDeck.clear();
        tableDeck.add(toReturn.pollFirst());
        return toReturn;
    }

    public Card topCard() {
        return tableDeck.peekLast();
    }
}
