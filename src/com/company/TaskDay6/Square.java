package com.company.TaskDay6;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 1; i < number; i++) {
            int num = i*i;
            if(num < number){
                System.out.println(num);
            }
        }
    }
}
