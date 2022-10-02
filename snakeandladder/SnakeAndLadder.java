package com.snakeandladder;

import java.util.Random;

public class SnakeAndLadder {

    public static void main(String[] args) {


        System.out.println("Welcome to SnakeAnd Ladder");

        Random random = new Random();


        int player = 0;// uc1
        System.out.println("Player position => "+player);

        int dice = random.nextInt(6)+1;// uc2


        int game = random.nextInt(3)+1; // uc3

        switch(game){
            case 1:                                 // No Play case
                player +=0;
                System.out.println(" Score of Player is => "+player);
                break;

            case 2:                                 // Ladder Case
                player = player + dice;
                System.out.println(" Score of Player is => "+player);
                break;

            case 3:                                 // Snake Case
                player = player - dice;
                System.out.println("Score of Player is => "+player);
                break;
        }
   
    }
}
