package com.company.TaskDay4;

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        if(num % 5 == 0){
            System.out.println("good");
        }else {
            System.out.println("not good");
        }
    }
}
