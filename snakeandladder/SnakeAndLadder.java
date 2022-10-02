package com.snakeandladder;

import java.util.Random;

public class SnakeAndLadder {

    public static void main(String[] args) {


        System.out.println("Welcome to SnakeAnd Ladder");

        Random random = new Random();


        int player = 0;// uc1
        System.out.println("Player position => "+player);

        int dice = random.nextInt(6)+1;// uc2

   
    }
}
