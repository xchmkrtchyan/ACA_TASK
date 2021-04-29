package com.company.TaskDay1;

import java.util.Scanner;

public class ProgrammSecondDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int secondDigit = (num / 10) % 10;
        int firstDigit = num/100;
        int sumOfDigits = (((num / 10) % 10) + (num/100) + (num % 10));
        System.out.println(secondDigit);
        System.out.println(firstDigit);
        System.out.println(sumOfDigits);
    }
}
