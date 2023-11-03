package GameEntities.Misc;

import java.util.ArrayList;
import java.util.List;

import Deck.Card;
import Deck.Deck;
import GameEntities.Player;
import KargaBuro.KargaBuroCardValidity;

public abstract class PlayerAction {
    public List<Card> drawCard(int howMany, Deck deck){
        List<Card> drawnCards = new ArrayList<>();
        drawnCards.addAll(deck.getCards(howMany));
        return drawnCards;
    }

    public abstract Card throwCard(Player currentPlayer, Card fromTable);

    public abstract KargaBuroCardValidity getCardValidator();
}
