package com.company.TaskDay6;

import java.util.Scanner;

public class SmallestInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 32;
        for (int base = 2; base < N; base++) {
            int exponent = 4;

            long result = 1;

            while (exponent != 0) {
                result *= base;
                --exponent;
            }

            System.out.println("Answer = " + result);
           // if(result < N){
           //     System.out.println(result);
           //     break;
           // }
        }

    }
}

