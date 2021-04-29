package com.company.TaskDay2;

import java.util.Scanner;

public class ProgrammThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_1 = scanner.nextInt();
        int num_2 = scanner.nextInt();
        int num_3 = scanner.nextInt();

        int sum = num_1 + num_2 + num_3;
        int average = (num_1 + num_2 + num_3)/2;
        int difference = num_1 - num_2 - num_3;

        System.out.println(sum);
        System.out.println(average);
        System.out.println(difference);
    }
}
