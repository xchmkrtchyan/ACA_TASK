package com.company.TaskDay8;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set length of list: ");
        int length = scanner.nextInt();
        System.out.println("Enter numbers: ");
        int[] array = new int[length];
        int numbers;
        for (int i = 0; i < length; i++) {
            numbers = scanner.nextInt();
            array[i] = numbers;
        }
        for (int i = 1; i < length; i++) {
            if (array[i] > array[i - 1]) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
