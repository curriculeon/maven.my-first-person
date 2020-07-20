package com.github.curriculeon;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    public Integer personAge = Integer.MAX_VALUE;
    public String personName = "";

    public Person() {
    }

    public Person(Integer age) {
        this.personAge = age;
    }

    public Person(String name) {
        this.personName = name;
    }

    public Person(String name, Integer age) {
        this.personName = name;
        this.personAge = age;
    }

    public void setName(String name) {
        this.personName = name;
    }

    public void setAge(Integer age) {
        this.personAge = age;
    }

    public String getName() {
        return personName;
    }

    public Integer getAge() {
        return personAge;
    }
}
