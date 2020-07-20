package com.github.curriculeon;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    String name;
    int age;

    public Person() {

    }

    public Person(int age) {
        this.setAge(age);
    }

    public Person(String name) {
        this.setName(name);
    }

    public Person(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age= age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
