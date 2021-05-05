package com.company.TaskDay7;

import java.util.Scanner;

public class AllNaturalDivisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        for (int i = 1; i <= x; i++) {
            if(x % i == 0)
                System.out.print(i + " ");
        }

 //       if (x % 2 == 0) {
 //           System.out.print(2 + " " + 2 * 2);
 //       } else if (x % 3 == 0) {
 //           System.out.println(3);
 //       } else if (x % 5 == 0) {
 //           System.out.println(5);
 //       } else {
 //           System.out.println(x);
 //   }
}}
