package com.github.curriculeon;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    //instance variables
    private String theName;
    private Integer theAge;


    public Person() {
        this.theName = "";
        this.theAge = Integer.MAX_VALUE;
    }

    public Person(Integer age) {
        this.theAge = age;
    }

    public Person(String name) {
        this.theName = name;

    }

    public Person(String name, Integer age) {
        this.theName = name;
        this.theAge = age;
    }

    public void setName(String name) {
        this.theName = name;
    }

    public void setAge(Integer age) {
        this.theAge = age;
    }

    public String getName() {
        return theName;
    }

    public Integer getAge() {
        return theAge;

    }
}
