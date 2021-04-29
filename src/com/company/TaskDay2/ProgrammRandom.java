package com.company.TaskDay2;

import java.util.Random;
import java.util.Scanner;

public class ProgrammRandom {
    public static void main(String[] args) {
        Random random = new Random();

        int rand = random.nextInt(15);

        System.out.println(rand);


    }
}
