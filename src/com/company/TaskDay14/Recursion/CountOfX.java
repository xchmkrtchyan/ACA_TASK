package com.company.Recursion;

public class CountOfX {
    public int countX(String s){
        if (s.equals(""))return 0;
        if (s.charAt(0) == 'x')
            return 1 + countX(s.substring(1));
        else return countX(s.substring(1));

    }
    public String removeX(String s){
        if (s.equals(""))return s;
        if (s.charAt(0) == 'x')
            return removeX((s.substring(1)));
        else return s.charAt(0) + removeX((s.substring(1)));

    }
}
