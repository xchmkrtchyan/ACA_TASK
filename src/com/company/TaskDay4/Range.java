package com.company.TaskDay4;

import java.util.Random;

public class Range {
    public static void main(String[] args) {
        Random rn = new Random();
        int maximum = 120;
        int minimum = 80;
        int diff = maximum - minimum + 1;
        int random = rn.nextInt() % diff;
        int randomNum;
        if(random < 0 ){
            random *= -1;
        }
        randomNum = minimum + random;
        System.out.println(randomNum);
    }
}
