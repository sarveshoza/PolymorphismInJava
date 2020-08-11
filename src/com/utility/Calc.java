package com.utility;

public class Calc {

    public void add(int a, int b) { // this method will add two numbers
        System.out.println("a+b = " + a+b );
    }

    public void add(int a, int b, int c) { // this method will add three numbers
        System.out.println("a+b+c = " + a+b+c );
    }
    public void add(String a, String b) { // this method will add two strings
        System.out.println("a +b  = " + a.concat(b) );
    }

}
