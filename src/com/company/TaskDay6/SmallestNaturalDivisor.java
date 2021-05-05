package com.company.TaskDay6;

import java.util.Scanner;

public class SmallestNaturalDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        if (input % 2 == 0)
            System.out.println(2);

        for (int i = 3; i * i <= input; i += 2) {
            if (input % i == 0){
                System.out.println(i);
            }else {
                System.out.println(input);
            }

        }

    }
}

