package com.company.TaskDay4;

import java.util.Random;
import java.util.Scanner;

public class Generate {
    public static void main(String[] args) {
        Random random = new Random();

        int rand = random.nextInt(7 - 1 + 1) + 1;
        if(rand == 7){
            System.out.println("Sunday");
        }else if(rand == 6){
            System.out.println("Saturday");
        }else if(rand == 5){
            System.out.println("Friday");
        }else if(rand == 4){
            System.out.println("Thursday");
        }else if(rand == 3){
            System.out.println("Wednesday");
        }else if(rand == 2){
            System.out.println("Thursday");
        }else if(rand == 1){
            System.out.println("Monday");
        }

    }
}
