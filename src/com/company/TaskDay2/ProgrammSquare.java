package com.company.TaskDay2;

import java.util.Scanner;

public class ProgrammSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int triangle_a = scanner.nextInt();
        int triangle_b = scanner.nextInt();

        int area = (triangle_a * triangle_b)/2;
        System.out.println(area);

        int square_a = scanner.nextInt();
        int square_b = scanner.nextInt();

        int square_square = square_a * square_b;

        System.out.println(square_square);

        int rectangle_a = scanner.nextInt();
        int rectangle_b = scanner.nextInt();

        int rectangle_area = rectangle_a * rectangle_b;
        System.out.println(rectangle_area);

    }
}
