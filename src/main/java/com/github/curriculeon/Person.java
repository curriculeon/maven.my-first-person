package com.github.curriculeon;

/**
 * Created by leon on 2/12/18.
 */
// implement a Java Class which encapsulates data about a Person object
public class Person {
    private String name;
    private int age;

    public Person() {
        this.name = "";
        this.age = age;
    }

    public Person(int age) {
        this.age = age;
        this.name = null;
    }

    public Person(String name) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
