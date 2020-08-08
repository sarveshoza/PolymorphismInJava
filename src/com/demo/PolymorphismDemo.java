package com.demo;

import com.pojo.Person;

public class PolymorphismDemo {


    public static void main(String[] args) {
        Person john = new Person(1, "John", 35, "Delhi", "male");
        Person dessy = new Person(2, "Dessy", 20, "Pune", "female");

        john.play();
        dessy.study();
    }

}

