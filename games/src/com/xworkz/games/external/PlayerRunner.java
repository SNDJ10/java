package com.xworkz.games.external;

import com.xworkz.games.internal.Cricket;
import com.xworkz.games.internal.IndianCricket;
import com.xworkz.games.internal.Players;

public class PlayerRunner {
    public static void main(String[] args) {
        Players players=new Players("dravid",254333);
        Cricket cricket=new IndianCricket("shubman Gill",20000,players);
        cricket.displayPlayers();
        players.playersDetails();
    }

}
