package com.company.TaskDay7;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int firstNum = number % 10;
        //System.out.println(firstNum);
        int secondNum = (number / 10) % 10;
        int lastNum = (number / 100);
        if(firstNum == 0){
            System.out.println(secondNum  + "" + lastNum);
        }else {
            System.out.println(firstNum + "" + secondNum + "" + lastNum);
        }
    }
}
