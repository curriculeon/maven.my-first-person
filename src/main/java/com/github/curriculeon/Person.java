package com.github.curriculeon;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name = "";
    private Integer age = Integer.MAX_VALUE;

    public Person() {

    }

    public Person(Integer age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name ;
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
