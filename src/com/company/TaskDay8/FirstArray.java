package com.company.TaskDay8;

public class FirstArray {
    public static void main(String[] args) {
        int[] array = new int[7000];
        int length = array.length;
            for (int j = 0; j < 7000; j++) {
                if (j % 7 == 0) {
                    array[j] = j;
                    System.out.print(array[j] + " ");
                }
            }
        }
       // System.out.println("\n" + length);

    }

