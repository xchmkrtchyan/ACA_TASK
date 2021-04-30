package com.company.TaskDay5;

import java.util.Scanner;

public class Range {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        switch ((number >= 0 && number <= 44) ? 1 : (number >= 45 && number <= 89) ? 2 : (number >= 90 && number <= 134) ? 3 : 4 ){
            case 1:
                System.out.println("Range in 0 -> 44");
                break;
            case 2:
                System.out.println("Range in 45 -> 89");
                break;
            case 3:
                System.out.println("Range in 90 -> 134");
            case 4:
                System.out.println("Please enter validate number");
        }
    }
}
