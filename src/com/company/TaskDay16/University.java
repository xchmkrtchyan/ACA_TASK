package com.company.TaskDay15;

import java.util.Scanner;

public class University {
    String name;
    int countOfStudents;
    int maxCountOfStudents;
    int maxAgeOfStudent;
    int minAgeOfStudent;

    public University(String name, int countOfStudents, int maxCountOfStudents, int maxAgeOfStudent, int minAgeOfStudent) {
        this.name = name;
        this.countOfStudents = countOfStudents;
        this.maxCountOfStudents = maxCountOfStudents;
        this.maxAgeOfStudent = maxAgeOfStudent;
        this.minAgeOfStudent = minAgeOfStudent;
    }

    void checkAge(int age) {
        if (age >= 18) {
            System.out.println("Valid age");
        } else {
            System.out.println("No Valid");
        }
    }

    void register(){
        countOfStudents++;
    }
    void admission() {
        System.out.println("Applied Mathematics -- 1");
        System.out.println("Computer science -- 2");
        System.out.println("Creative Arts & Design -- 3");
        System.out.println("Engineering -- 4");
        System.out.println("Health Sciences -- 5");
        System.out.println("Historical, Philosophical & Religious Studies -- 6");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 0 && number <= 6){
            System.out.println("Input your age");
            int age = scanner.nextByte();
            if(age >= 18){
                System.out.println("Valid");
                System.out.println("Registered");
            }else {
                System.out.println("Invalid age");
            }
        }
    }

    void display(){
        printInfo();
    }
    void printInfo() {
        System.out.println(name + " " + countOfStudents + " " + maxAgeOfStudent + " " + maxCountOfStudents + " " + minAgeOfStudent);
    }
}
