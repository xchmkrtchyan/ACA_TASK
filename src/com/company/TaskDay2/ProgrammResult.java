package com.company.TaskDay2;

import java.util.Scanner;

public class ProgrammResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte b = scanner.nextByte();
        short c = scanner.nextShort();
        int a = scanner.nextInt();

        int average = (a + b + c) / 3;

        System.out.println(average);
    }
}
