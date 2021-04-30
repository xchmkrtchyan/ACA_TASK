package com.company.TaskDay5;

import java.util.Scanner;

public class ConsonantOrVowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your letter");
        String str = scanner.nextLine();
        switch (str){
            case "a":
                System.out.println(str + " is a Vowel");
                break;
            case "e":
                System.out.println(str + " is a Vowel");
                break;
            case "i":
                System.out.println(str + " is a Vowel");
                break;
            case "o":
                System.out.println(str + " is a Vowel");
                break;
            case "u":
                System.out.println(str + " is a Vowel");
                break;
            case "A":
                System.out.println(str + " is a Vowel");
                break;
            case "E":
                System.out.println(str + " is a Vowel");
                break;
            case "I":
                System.out.println(str + " is a Vowel");
                break;
            case "O":
                System.out.println(str + " is a Vowel");
                break;
            case "U":
                System.out.println(str + " is a Vowel");
                break;
            default:
                System.out.println(str + " is a Consonant");
        }
    }
}
