package com.github.curriculeon;

/**
 * Created by leon on 2/12/18.
 */
// implement a Java Class which encapsulates data about a Person object
public class Person { //class signature
    private String name; //instance variable
    private Integer age; //instance variable

    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
    }

    public Person(Integer age) { //constructor signature
        this.age = age;// setting instance variable
    }

    public Person(String name) { //constructor signature
        this.name = name; // setting instance variable
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }
}
