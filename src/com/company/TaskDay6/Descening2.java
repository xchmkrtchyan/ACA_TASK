package com.company.TaskDay6;

import java.util.Scanner;

public class Descening2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int i = 0;
        while (i < number) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
            number--;
        }
    }
}
