package com.demo;

import com.utility.Calc;

public class PolymorphismDemo {


    public static void main(String[] args) {

        Calc calc = new Calc();

        calc.add(5,6);
        calc.add(2,3,5);
        calc.add("Compile Time"," Polymorphism");

    }

}

