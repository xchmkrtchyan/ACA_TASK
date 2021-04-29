package com.company.TaskDay3;

import java.util.Scanner;

public class ParsesName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rangs = scanner.nextInt();

        if (rangs >= 98 || rangs >= 70) {
            System.out.println("lav a");
        } else if (rangs == 50) {
            System.out.println("mijin");                           //98 70 50 mijin 20 cayrahex canr 0 meraca
        } else if (rangs <= 30) {
            System.out.println("lav chi");
        } else if (rangs == 0) {
            System.out.println("dead");
        }
    }
}
