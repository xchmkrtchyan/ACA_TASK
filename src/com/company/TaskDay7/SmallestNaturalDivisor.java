package com.company.TaskDay7;

import java.util.Scanner;

public class SmallestNaturalDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        if (x < 2) {
            System.out.println("Wrong");
        }
        for (; x <= 30000; ) {
            if (x % 2 == 0) {
                System.out.println(2);
            } else if (x % 3 == 0) {
                System.out.println(3);
            } else if (x % 5 == 0) {
                System.out.println(5);
            } else {
                System.out.println(x);
            }
            break;
        }
    }
}

