package GameEntities;

import java.util.Scanner;

import Deck.Card;
import GameEntities.Misc.PlayerAction;

public class User extends Player{
    static Scanner scan = new Scanner(System.in);

    public User(String name, PlayerAction pAction) {
        super(name, pAction);
    }

    @Override
    public Card chooseCard(Card fromTable) {
        Card chosenCard = null;
        boolean validCard;
        int index;
        do{            
            do{
                showCards();
                System.out.println("[0] draw card");
                System.out.print("Choose card: ");
                index = scan.nextInt();
                index--;
                if(index == -1) {
                    return null;
                }
            }while(!validChoice(index));
            chosenCard = playerCards.get(index);
            validCard = cValidator.isValid(chosenCard, fromTable);
            if(!validCard)
                System.out.println("not a valid card, card must be the same suit");
        }while(!validCard);
        return chosenCard;
    }
}