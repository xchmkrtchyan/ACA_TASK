package com.company.TaskDay2;

import java.util.Random;

public class ProgrammSecondRand {
    public static void main(String[] args) {
        Random random = new Random();

        int min = 15;
        int max = 30;

        int diff = max - min;

        int rand = random.nextInt(diff + 1);
        rand += min;
        System.out.println(rand);

    }
}
