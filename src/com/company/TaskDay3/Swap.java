package com.company.TaskDay3;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        firstNum = firstNum - secondNum;
        secondNum = firstNum + secondNum;
        firstNum = secondNum - firstNum;
        System.out.println(firstNum);
        System.out.println(secondNum);
    }
}
