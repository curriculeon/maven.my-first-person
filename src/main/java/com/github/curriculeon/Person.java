package com.github.curriculeon;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private Integer personAge;
    private String personName;

    public Person() {
        personAge = Integer.MAX_VALUE;
        personName = "";
    }

    public Person(int age) {
        personAge = age;
        personName = "";
    }

    public Person(String name) {
        personName = name;
        personAge = Integer.MAX_VALUE;
    }

    public Person(String name, int age) {
       personName = name;
       personAge = age;
    }

    public void setName(String name) {
        personName = name;
    }

    public void setAge(int age) {
        personAge = age;
    }

    public String getName() {
        return personName;
    }

    public Integer getAge() {
        return personAge;
    }
}
