package com.company.TaskDay2;

import java.util.Scanner;

public class ProgrammDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int lastDigit = num % 10;

        System.out.println(lastDigit);
    }
}
