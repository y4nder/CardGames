package Deck;

import Deck.CardAttribute.*;

public class FaceCard extends Card{
    private final Face face;
    
    public FaceCard(Suit suite, Face face) {
        super(suite);
        this.face = face;
    }

    public Face getFace(){
        return face;
    }
    
    @Override
    public String toString() {
        return face + " of " + getSuite() + "S";
    }

}
