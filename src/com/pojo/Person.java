package com.pojo;

public class Person {

    private int unique_id;
    private String name;
    private int age;
    private String city;
    private String gender;

    public Person() {
    }

    public Person(int unique_id, String name, int age, String city, String gender) {
        this.unique_id = unique_id;
        this.name = name;
        this.age = age;
        this.city = city;
        this.gender = gender;
    }

    public int getUnique_id() {
        return unique_id;
    }

    public void setUnique_id(int unique_id) {
        this.unique_id = unique_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void eat(){
        System.out.println(this.name +" am eating");
    }
    public void study(){
        System.out.println(this.name +" am studying");
    }

    public void sleep(){
        System.out.println(this.name +" am sleeping");
    }

    public void play(){
        System.out.println(this.name +" am playing");
    }

}
