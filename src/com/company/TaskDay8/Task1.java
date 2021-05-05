package com.company.TaskDay8;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();

        int[] array = new int[length + 1];

        for (int i = 0; i <= length; i++) {
            if( i % 2 != 0){
                array[i] = i;
                System.out.print(array[i]  + " ");
            }
        }
    }
}
