package com.company.TaskDay7;

import java.util.Scanner;

public class Representation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int d = scanner.nextInt();
        int count = 0;

        for (int i = x; i > 0; i /= 10) {
            if (x % 10 == d) {
                count++;
            }
            x /= 10;
        }
        System.out.println(count);
    }
}

