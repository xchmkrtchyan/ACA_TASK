package com.company.TaskDay4;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();

        int newRandom;
        int myRandom = random.nextInt();
        if(myRandom < 2) {
            System.out.println(myRandom = myRandom - (myRandom - 3));
        }else if (myRandom > 7){
            System.out.println(myRandom = myRandom - (myRandom - 7));
        }
    }
}
