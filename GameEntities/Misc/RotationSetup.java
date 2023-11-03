package GameEntities.Misc;

import java.util.List;
import GameEntities.Player;

public class RotationSetup {
    public Player setupRotation(List<Player> allPlayers, Rotations rotations){
        Player head, tail;
        head = tail = null;
        if(rotations == Rotations.RIGHT_ROTATION){
            for(int i = 0; i < allPlayers.size(); i++){
                if(head == null){
                    head = allPlayers.get(0);
                    tail = head;
                }
                else{
                    tail.setPlayerRight(allPlayers.get(i));
                    allPlayers.get(i).setPlayerLeft(tail);
                    tail = allPlayers.get(i);
                }
            }
            head.setPlayerLeft(tail);
            tail.setPlayerRight(head);
            return head;
        }
        else{
            for(int i = 0; i < allPlayers.size(); i++){
                if(head == null){
                    head = allPlayers.get(0);
                    tail = head;
                }
                else{
                    tail.setPlayerLeft(allPlayers.get(i));
                    allPlayers.get(i).setPlayerRight(tail);
                    tail = allPlayers.get(i);
                }
            }
            head.setPlayerRight(tail);
            tail.setPlayerLeft(head);
            return head;
        }
    }

}
