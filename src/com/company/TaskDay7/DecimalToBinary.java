package com.company.TaskDay7;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int count = 0;
        int decimal = 2;
        int sum = 0;
        double result = 0;
        for (int i = number; i > 0; i /= 10) {
            count++;
        }
        System.out.println("Count = " + count);
        for (int i = 0; i < count; i++) {
            //number /= 10;
            if (number % 10 == 1) {
                result = result + Math.pow(decimal, i);
            }
            number = number / 10;
        }
        System.out.println(result);
    }
}
