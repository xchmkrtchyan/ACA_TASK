package com.company.TaskDay3;

import java.util.Scanner;

public class NarrowingPrimitiveConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double doubleNumber = scanner.nextDouble();

        float floatNumber = (float) doubleNumber;
        System.out.println(floatNumber);

        long longNumber = (long) floatNumber;
        System.out.println(longNumber);

        int intNumber = (int) longNumber;
        System.out.println(intNumber);

        short shortNumber = (short) intNumber;
        System.out.println(shortNumber);

        byte byteNumber = (byte) shortNumber;
        System.out.println(byteNumber);
    }
}
