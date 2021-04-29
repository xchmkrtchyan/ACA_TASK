package com.company.TaskDay1;

import java.util.Scanner;

public class ProgrammSwap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 7;
        int b = 3;

        a = a - b;
        b = a + b;
        a = b - a;

        System.out.println(a);
        System.out.println(b);

    }
}
