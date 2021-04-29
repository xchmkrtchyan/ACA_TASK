package com.company.TaskDay2;

import java.util.Scanner;

public class ProgrammS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int S = (3 * n * n) - 12 * n;

        System.out.println(S);
    }
}
