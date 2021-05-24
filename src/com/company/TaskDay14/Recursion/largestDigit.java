package com.company.TaskDay14.Recursion;

public class Task12 {
    public static char largestDigit(String str,int n,char max) {
        if(max < str.charAt(n))
            max = str.charAt(n);
        if(n == str.length()-1)
            return max;
        return largestDigit(str,n+1,max);
    }
}
