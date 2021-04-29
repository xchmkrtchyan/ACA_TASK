package com.company.TaskDay1;

import java.util.Scanner;

public class ProgrammOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        boolean bool = ((num % 2) == 0);

        System.out.println(bool);
    }
}
