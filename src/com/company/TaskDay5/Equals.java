package com.company.TaskDay5;

import java.util.Scanner;

public class Equals {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);

        String myName  = str.next();
        String yourName  = str.next();

        if(myName.equals(yourName)){
            System.out.println("True");
        }
        //boolean fin = myName != yourName;
        //boolean classfinal = myName.equals(yourName);

        //System.out.println(myName.hashCode());
        //System.out.println(yourName.hashCode());
        //System.out.println(fin);
        //System.out.println(classfinal);
    }
}
