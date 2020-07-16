package com.github.curriculeon;

/**
 * Created by leon on 2/12/18.
 */

/**
 * methods implemented.
 * Monica Deshmukh 07/16/2020
 */

public class Person {
    private String name;
    private Integer age;

    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
    }

    public  Person(Integer age){
        this();
        this.age = age;
    }

    public Person(String name) {
        this();
        this.name = name;
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
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
