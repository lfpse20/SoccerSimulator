package Team;

import Player.Player;
import Generator.PlayerGeneratorEngine;

import java.util.ArrayList;
import java.util.List;

public class Academy {

    private List<Player> players;
    private int currentPlayers;
    private final int MAX_PLAYERS = 10;

    public Academy(){
        players = new ArrayList<>();
    }

    public void fillAcademy(){
        for(currentPlayers = 0; currentPlayers < MAX_PLAYERS; ++currentPlayers){
            players.add(PlayerGeneratorEngine.generatePlayer());
        }
    }

    public void showRoster(){
        for(Player p : players)
            System.out.println(p.toString());
    }
}
