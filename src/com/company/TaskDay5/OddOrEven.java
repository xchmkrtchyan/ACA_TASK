package com.company.TaskDay5;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        switch (num % 2 ){
            case 0:
                System.out.println("even");
                break;
            case 1:
                System.out.println("odd");
                break;
        }
    }
}
