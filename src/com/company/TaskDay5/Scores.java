package com.company.TaskDay5;

import java.util.Scanner;

public class Scores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quiz score:");
        int quizScore = scanner.nextInt();
        System.out.print("Mid-term score:");
        int midTermScore = scanner.nextInt();
        System.out.print("Final score:");
        int finalScore = scanner.nextInt();
        int determine = (quizScore + midTermScore + finalScore) / 3;
        if (determine >= 80) {
            System.out.println("Output`\n" +
                    "Your grade is A.");
        } else if (determine >= 60 && determine < 80) {
            System.out.println("Output`\n" +
                    "Your grade is B.");
        } else if (determine >= 40 && determine < 60) {
            System.out.println("Output`\n" +
                    "Your grade is C.");
        } else {
            System.out.println("Output`\n" +
                    "Your grade is D.");
        }
    }
}
