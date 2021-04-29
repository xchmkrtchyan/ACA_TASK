package com.company.TaskDay3;

import java.util.Scanner;

public class NumberRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        if (num > 0){
            System.out.println(num);
        }else if (num == 0){
            System.out.println("Number is Zero");
        }else{
            System.out.println(num * -1);
        }
        System.out.println(Math.abs(0));
    }
}
