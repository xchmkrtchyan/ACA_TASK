package com.company.Recursion;

public class StringReverse {
    void reverse(String str) {
        if (str == null || str.length() <= 1) {
            System.out.println(str);
        } else {
            System.out.print(str.charAt(str.length() - 1));
            reverse(str.substring(0, str.length() - 1));
        }
    }

    public String endX(String str) {
        if (str.equals("")) return str;
        if (str.charAt(0) == 'x') return endX(str.substring(1)) + 'x';
        else return str.charAt(0) + endX(str.substring(1));
    }

    public String stringClean(String str){
        if (str.length() < 2) return str;
        if (str.charAt(0) == str.charAt(1)) return stringClean(str.substring(1));
        else return str.charAt(0) + stringClean(str.substring(1));
    }
    public int prime(int number){
        if (number == 0) return 0;
        if (number % number == 0 && number % 1 == 0) return number;
        else return prime(number + 1);
    }
    public int higherString(String str){
        int x = Character.getNumericValue(str.charAt(0));
        int y = Character.getNumericValue(str.charAt(1));
        if (x + y > higherString(str.substring(1))) return Integer.parseInt(String.valueOf(x) + String.valueOf(y));
        return higherString(str.substring(1));
    }
}
