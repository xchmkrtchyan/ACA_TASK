package com.company.TaskDay6;

import java.util.Scanner;

public class InegersPowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int i = 2;
        if (i < input)
        {
            System.out.println(1);
        }else {
            System.out.println("Wrong");
        }

        while (true){
            if(i < input){
                System.out.println(i);
            }else {
                break;
            }
            i = i * 2;
        }
        
    }
}
