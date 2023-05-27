package com.bridglabz.SnakeAndLadder;

public class SnakeAndLadder {
    public static void main(String[] args) {
        int player=0;
        int diceCount=1;
        int count=1;
        final int START_POSITION=0;
        final int SNAKE=1;
        final int LADDER=1;
        System.out.println("Welcome to snake and ladder game");
        int dice=(int)(Math.random()*6)+1;
        System.out.println(dice);
         int diceCheck=(int)(Math.random()*3);
         switch(diceCheck){
             case 0:player=player;
                 System.out.println(player+" "+dice);
                 break;
             case 1:player=player+dice;
                 System.out.println(player+ " "+dice);
                 break;
                 case 2:player=player-dice;
                     System.out.println(player+"  "+dice);
         }
    }
}
