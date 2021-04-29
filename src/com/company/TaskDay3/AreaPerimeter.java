package com.company.TaskDay3;

import java.util.Scanner;

public class AreaPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter value of radius: ");
        double radius = scanner.nextDouble();

        double pi = Math.PI;
        System.out.println(pi);

        double area = pi * Math.pow(radius,2);
        System.out.println("Area = " + area);

        double perimeter = 2 * pi * radius;
        System.out.println("Perimeter = " + perimeter);
    }
}
