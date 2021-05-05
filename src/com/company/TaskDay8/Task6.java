package com.company.TaskDay8;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set length of list: ");
        int length = scanner.nextInt();
        System.out.println("Enter numbers: ");
        int[] array = new int[length];
        int numbers;
        int index = 0;
        int maxNumber = length - (length -1);
        for (int i = 0; i < length; i++) {
            numbers = scanner.nextInt();
            array[i] = numbers;
        }
        for (int i = 0; i < length; i++) {
                if(array[i] > maxNumber){
                    maxNumber = array[i];
                    index = i;
            }
        }
        System.out.print("Max number = " + maxNumber + "\n");
        System.out.println("Index = " + index);
    }
}
