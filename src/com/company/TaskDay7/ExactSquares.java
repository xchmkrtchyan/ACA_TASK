package com.company.TaskDay7;

import java.util.Scanner;

public class ExactSquares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int number = a; number <= b; number++) {
            for (int power = 1; power < b; power++) {
                if(number == Math.sqrt(power)){
                    System.out.println(power);
                }
            }
        }
    }
}
