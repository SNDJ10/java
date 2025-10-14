package com.xworkz.games.internal;

public abstract class Cricket {
    public String playersName;
    public  int playersPrice;
    public Players players;
    public Cricket(String playersName,int playersPrice,Players players) {

        this.playersName = playersName;
        this.playersPrice = playersPrice;
        this.players = players;
    }
        public void displayPlayers(){


            System.out.println("this is players list"+playersName);
            System.out.println("this is player salary"+playersPrice);
            System.out.println("this is custom data players"+players);
        }

}
