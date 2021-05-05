package com.company.TaskDay7;

import java.util.Scanner;

public class ProgramSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();

        for (int k = 0; k < i; k++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
