package com.company.TaskDay3;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double fahrenheit = scanner.nextDouble();

        double celsius = ((fahrenheit - 32.0) * (5.0/9.0));

        float celsiusFloat = (float) celsius;
        System.out.println(celsiusFloat);

        int celsiusInt = (int) celsiusFloat;
        System.out.println(celsiusInt);
    }
}
