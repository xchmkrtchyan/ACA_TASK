package com.company.TaskDay4;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte hisAge = scanner.nextByte();

        if(hisAge >= 18){
            System.out.println("You can vote");
        }else {
            System.out.println("You can't vote");
        }
    }

}
