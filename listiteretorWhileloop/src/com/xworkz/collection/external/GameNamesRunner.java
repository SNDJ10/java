package com.xworkz.collection.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class GameNamesRunner {
    public static void main(String[] args) {
        List<String> gameList = new ArrayList<>();
        gameList.add("Cricket");
        gameList.add("Football");
        gameList.add("Hockey");
        gameList.add("Tennis");
        gameList.add("Badminton");
        gameList.add("Chess");
        gameList.add("Volleyball");
        gameList.add("Kabaddi");

        ListIterator<String> gameIterator = gameList.listIterator();
        while (gameIterator.hasNext()) {
            Object object = gameIterator.next();
            String game = (String) object;

            if (game.equals("Football")) {
                gameIterator.add("Basketball");
            }
            if (game.equals("Tennis")) {
                gameIterator.add("Table Tennis");
            }

            System.out.println(game);
        }
        System.out.println("Final list of game names===" + gameList);
    }
}

