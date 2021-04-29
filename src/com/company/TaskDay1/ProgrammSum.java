package com.company.TaskDay1;

import java.util.Scanner;

public class ProgrammSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number_1 = scanner.nextInt();
        int number_2 = scanner.nextInt();

        int sum = number_1 * number_2;

        System.out.println(sum);
    }
}
