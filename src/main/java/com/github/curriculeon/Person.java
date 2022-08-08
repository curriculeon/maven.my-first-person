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

    public Person(int age) {
        this.theAge = age;
    }

    public Person(String name) {
        this.theName = name;

    }

    public Person(String name, int age) {
        this.theName = name;
        this.theAge = age;
    }

    public void setName(String name) {
        this.theName = name;
    }

    public void setAge(int age) {
        this.theAge = age;
    }

    public String getName() {
        if (theName == null) {
            return null;
        }
        return theName;
    }

    public Integer getAge() {
        if (theAge == null){
            return null;
        }
        return theAge;

    }
}
