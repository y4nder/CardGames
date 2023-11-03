package GameEntities;

import java.util.Scanner;

import Deck.Card;
import GameEntities.Misc.PlayerAction;

public class User extends Player{

    public User(String name, PlayerAction pAction) {
        super(name, pAction);
    }

    @Override
    public Card chooseCard() {
        Scanner scan = new Scanner(System.in);
        int index;
        do{
            showCards();
            System.out.print("Choose card: ");
            index = scan.nextInt();
            index--;
            if(index == -1) return null;
        }while(!validChoice(index));
        Card chosenCard = playerCards.get(index);
        return chosenCard;
    }
}