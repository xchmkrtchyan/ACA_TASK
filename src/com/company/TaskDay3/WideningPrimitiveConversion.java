package com.company.TaskDay3;

import java.util.Scanner;

public class WideningPrimitiveConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte byteNumber = scanner.nextByte();

        short shortNumber = (short) byteNumber;
        System.out.println(shortNumber);

        int intNumber = (int) shortNumber;
        System.out.println(intNumber);

        long longNumber = (long) intNumber;
        System.out.println(longNumber);

        float floatNumber = (float) longNumber;
        System.out.println(floatNumber);

        double doubleNumber = (double) floatNumber;
        System.out.println(doubleNumber);
    }
}
