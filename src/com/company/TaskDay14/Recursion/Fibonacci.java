package com.company.Recursion;

public class Fibonacci {
    public int fibonacci(int n){
        if(n <= 1)
            return n;
        else
            return n = fibonacci(n - 1) + fibonacci(n - 2);
    }
}
