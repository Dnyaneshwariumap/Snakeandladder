package com.snakeandladder;

import java.util.Random;

public class SnakeAndLadder {

    public static void main(String[] args) {


        System.out.println("Welcome to SnakeAnd Ladder");

        Random random = new Random();


        int player = 0;// uc1
        System.out.println("Player position => " + player);
        int count=0;
        while (player != 100) {
            count++;
            int dice = random.nextInt(6) + 1;// uc2
            System.out.println("dice show"+dice);

            int game = random.nextInt(3) + 1; // uc3

            switch (game) {
                case 1:                                 // No Play case
                    player += 0;
                    System.out.println(" No play  =>  Score of Player is => " + player);
                    break;

                case 2:                                 // Ladder Case
                    int temp = player;
                    player = player + dice; // Ladder Case
                    if (player > 100) {
                        int zero =0;
                        player =  zero + temp;

                        System.out.println(" Try Again! ");
                        System.out.println("Ladder  =>   Score of Player is => " + player);

                    } else if (player ==100) { //uc5

                        System.out.println("Ladder  =>   Score of Player is => " + player);
                        System.out.println("Player won!");

                    } else {


                        System.out.println("Ladder  =>   Score of Player is => " + player);
                        System.out.println("");
                        continue;
                    }break;


                case 3:                                 // Snake Case
                    player = player - dice;
                    if (player<0){
                        player =0;  //uc4
                    }
                    System.out.println("Snake  =>  Score of Player is => " + player);
                    break;
            }

        }
        System.out.println("dice rolled count =>"+count);//uc6
    }
}
