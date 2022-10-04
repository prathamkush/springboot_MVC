package org.example;

import java.util.Arrays;
import java.util.List;

public class PlayerService {

    private List<Player> players = Arrays.asList(new Player(1,"Alice","British",22),
                                                new Player(2,"Bob","Indian",32),
                                                new Player(3,"Carol","JAPANESE",15),
                                                new Player(4,"Dave","British",20)
                                                 );


    public Player getPlayerByName(String name){
        return players.stream().filter(p -> p.getName().equals(name)).findFirst().get();
    }

    public Player getPlayerById(int id){
        return players.stream().filter(p -> p.getId() == id).findFirst().get();
    }
}
