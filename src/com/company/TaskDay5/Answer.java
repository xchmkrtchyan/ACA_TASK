package com.company.TaskDay5;

import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the correct way to declare a variable to store an integer value in Java?\n" +
                "   a. int 1x=10;\n" +
                "   b. int x=10;\n" +
                "   c. float x=10.0f;\n" +
                "   d. string x=\"10\";");
        System.out.print("Enter your choice: ");
        String str = scanner.nextLine();
        switch (str){
            case "b":
                System.out.println("Congratulations");
            case "a":
                System.out.println("Invalid choice");
            case "d":
                System.out.println("Invalid choice");
            case "c":
                System.out.println("Invalid choice");
            default:
                System.out.println("Wrong answer");
        }

    }
}
