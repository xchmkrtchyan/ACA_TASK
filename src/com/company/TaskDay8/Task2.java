package com.company.TaskDay8;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set length of list: ");
        int length = scanner.nextInt();
        System.out.println("Enter numbers: ");
        int[] array = new int[length + 1];
        int numbers = 0;
        for (int i = 0; i < length; i++) {
            numbers = scanner.nextInt();
            array[i] = numbers;
        }
        for (int i = 0; i <= length; i++) {
            if (array[i] % 2 == 0 && array[i] != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
