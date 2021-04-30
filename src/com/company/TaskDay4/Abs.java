package com.company.TaskDay4;

import java.util.Scanner;

public class Abs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float num = scanner.nextFloat();

        if(num == 0){
            System.out.println("zero");
        }else if(num < 0){
            System.out.println("negative");
        }else if(num > 0){
            System.out.println("positive");
        }else if(Math.abs(num) <= 1){
            System.out.println("small");
        }else if(Math.abs(num) > 1000000){
            System.out.println("large");
        }
    }
}
