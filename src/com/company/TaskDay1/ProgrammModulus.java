package com.company.TaskDay1;

import java.util.Scanner;

public class ProgrammModulus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_1 = scanner.nextInt();
        int num_2 = scanner.nextInt();

        int modulus = num_1 % num_2;

        System.out.println(modulus);
    }
}
