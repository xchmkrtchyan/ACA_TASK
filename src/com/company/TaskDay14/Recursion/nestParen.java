package com.company.TaskDay14.Recursion;

public class Task15 {
    public static String nestParen(String str) {

        int len = str.length();
        if (len <= 2)
            return str;
        return str.charAt(0) + "(" + nestParen(str.substring(1, len - 1)) + ")" + str.charAt(len - 1);
    }
}
