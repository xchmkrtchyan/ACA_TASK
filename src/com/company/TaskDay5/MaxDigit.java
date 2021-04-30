package com.company.TaskDay5;

import java.util.Scanner;

public class MaxDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        switch ((num1 > num2 && num1 > num3) ? 1 : (num2 > num1 && num2 > num3) ? 2 : (num3 > num2 && num3 > num1) ? 3 : 4){
            case 1:
                System.out.println(num1);
            case 2:
                System.out.println(num2);
            case 3:
                System.out.println(num3);
            case 4:
                System.out.println();
        }
    }
}
