package com.company.TaskDay6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        while (true){
//            System.out.println("Press 1 for perimeter");
//            System.out.println("Press 2 for area");
//            System.out.println("Press 3 for exit");
//            String string = scanner.next();
//            double perimeter;
//            double area;
//            int radius = 4;
//            if(string.equals("1")){
//                System.out.print("Perimeter: ");
//                System.out.println(perimeter = 2 * Math.PI * radius);
//            }else if (string.equals("2")){
//                System.out.print("Area: ");
//                System.out.println(area = Math.PI * Math.pow(radius,2));
//            }else if (string.equals("3")){
//                System.out.println("exit");
//                break;
//            }else{
//                System.out.println("Wrong number");
//            }
//        }
//   }
        int base = 3, exponent = 4;

        long result = 1;

        while (exponent != 0)
        {
            result *= base;
            --exponent;
        }

        System.out.println("Answer = " + result);
    }
}
