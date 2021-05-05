package com.company.TaskDay7;

import java.util.Scanner;

public class CountDivisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        if (x <= 2 * 109) {
            int count = 0;
            for (int i = 1; i < x; i++) {
                if (x % i == 0) {
                    System.out.print(i + " ");
                    count++;
                }

            }
            System.out.println("Count = " + count);
        }

    }
}
