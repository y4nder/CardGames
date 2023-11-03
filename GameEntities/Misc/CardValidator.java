package GameEntities.Misc;

import Deck.Card;

public abstract class CardValidator {
    public abstract boolean isValid(Card myCard, Card fromTable);
}
