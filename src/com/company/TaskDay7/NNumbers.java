package com.company.TaskDay7;

import java.util.Scanner;

public class NNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        int lastNum = 0;
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        int count = scanner.nextInt();

        System.out.println("Count = " + count);
        for (int i = 0; i < count; i++) {
            //number /= 10;
            int number = scanner.nextInt();
            if (number > 0) {
                positiveCount++;
            }else if(number == 0){
                zeroCount++;
            }else if(number < 0){
                negativeCount++;
            }
        }
        System.out.println("Positive = " + positiveCount);
        System.out.println("Negative = " + negativeCount);
        System.out.println("Zero = " + zeroCount);
    }
}
