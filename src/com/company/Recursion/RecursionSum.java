package com.company.Recursion;

public class Recursion {
    public int recursion(int number[],int n) {
        if(n <= 0){
            return 0;
        }else
            return recursion(number,n-1) + number[n-1];
    }
}
