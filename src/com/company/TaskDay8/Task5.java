package com.company.TaskDay8;

import java.util.Scanner;

public class Task5 {
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
        for (int i = 0; i < length; i++) {
            if(array[i] > 0){
                if (array[i] > 0 && array[i + 1] > 0) {
                    System.out.print(array[i] + " " + array[i + 1] + " ");
                }
                break;
            } else if(array[i] < 0){
                if(array[i] < 0 && array[i + 1] < 0){
                    System.out.print(array[i] + " " + array[i + 1]+ " ");
                }
            }
        }
    }
}
