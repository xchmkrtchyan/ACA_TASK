package com.company.TaskDay5;

import java.util.Scanner;

public class Range {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        switch ((number >= 0 && number <= 99) ? 1 : (number >= 100 && number <= 199) ? 2 : (number >= 200 && number <= 299) ? 3 : 4 ){
            case 1:
                System.out.println("Range in 0 -> 99");
                break;
            case 2:
                System.out.println("Range in 100 -> 199");
                break;
            case 3:
                System.out.println("Range in 200 -> 299");
            case 4:
                System.out.println("Please enter validate number");
        }
    }
}
