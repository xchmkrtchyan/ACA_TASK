package com.company.TaskDay7;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();

        for (int k = 1; k < i; k++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k * j + " ");
            }
            System.out.println();
        }
    }
}
