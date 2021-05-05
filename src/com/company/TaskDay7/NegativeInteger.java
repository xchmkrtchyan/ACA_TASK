package com.company.TaskDay7;

import java.util.Scanner;

public class NegativeInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();

        for (int k = 1; k < i; k++) {
            for (int j = 1; j < i; j++) {
                System.out.print("#");
            }
            System.out.println();
            if(k % 2 != 0){
                System.out.print(" ");
            }
        }
    }
}
