package com.company.TaskDay4;

import java.util.Scanner;

public class Ice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        if(num % 5 == 0 && num % 3 == 0){
            System.out.println(num / 3);
        }
       // System.out.println(num % 5);
    }
}
