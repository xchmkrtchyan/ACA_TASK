package com.company.TaskDay5;

import java.util.Scanner;

public class StringTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        String stringFinal = string == null ? "-1" : string.equals(" ") ? "0" : "1" ;
        //String str2 = string.equals(" ") ? "0" : "1";

        System.out.println(stringFinal);
    }
}
