package Deck.CardTypes;

import Deck.CardAttribute.Face;

public class JokerCard extends Card{
    private Face face;

    public JokerCard(){
        super(null);
        this.face = Face.Joker;
    }

    @Override
    public String toString() {
        return "JOKER";
    }
}
