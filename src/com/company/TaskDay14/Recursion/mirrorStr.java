package com.company.TaskDay14.Recursion;

public class Task16 {
    public static String mirrorStr(String str) {
        if (str.length() <= 0) {
            return str;
        }
        if (str.charAt(str.length() - 1) != '(') {
            return "" + str.charAt(str.length() - 1) + mirrorStr(str.substring(0, str.length() - 1));
        } else {
            return ")" + mirrorStr(str.substring(0, str.length() - 1));
        }
    }
}
