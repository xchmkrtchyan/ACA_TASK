package com.company.TaskDay14.Recursion;

public class Task17 {
    public static String simetriStr(String str) {
        if (str.length() - 1 <= 0) {
            return str;
        }
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return simetriStr(str.substring(1, str.length() - 1));
        }
        return str.charAt(0) + simetriStr(str.substring(1, str.length() - 1)) + str.charAt(str.length() - 1);
    }
}
