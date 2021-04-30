package com.company.TaskDay5;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");
        int firstNum = scanner.nextInt();
        System.out.print("Enter second number:");
        int secondNum = scanner.nextInt();
        System.out.print("Enter an operator (+,-,*,/):");
        String string = scanner.next();
        int addition = firstNum + secondNum;
        int subtraction = firstNum - secondNum;
        int multiplication = firstNum * secondNum;
        int division = firstNum / secondNum;

        switch (string) {
            case "+":
                System.out.println(firstNum + "+" + secondNum + ":" + addition);
                break;
            case "-":
                System.out.println(firstNum + "-" + secondNum + ":" + subtraction);
                break;
            case "*":
                System.out.println(firstNum + "*" + secondNum + ":" + multiplication);
                break;
            case "/":
                System.out.println(firstNum + "/" + secondNum + ":" + division);
                break;
            default:
                System.out.println("Error");
        }
    }
}
