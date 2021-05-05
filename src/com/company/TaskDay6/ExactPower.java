package com.company.TaskDay6;

import java.util.Scanner;

public class ExactPower {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);

            int input = scanner.nextInt();

            if (input == 0 || input == 1){
                System.out.println("Wrong");
            }
            while ( input != 1)
            {
                if(input % 2 != 0){
                    System.out.println("Wrong input");
                    break;
                }
                input = input / 2;
                if (input != 1){
                    System.out.print(input + " ");
                }

            }
            break;

        }
    }
}
