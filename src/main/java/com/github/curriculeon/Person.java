package com.github.curriculeon;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private Integer age = Integer.MAX_VALUE;
    private String name = "";

    public Person() {

    }

    public Person(Integer age) {
        this.setAge(age);
    }

    public Person(String name) {
        this.setName(name);
    }

    public Person(String name, Integer age) {
        this.setName(name);
        this.setAge(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age= age;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }
}
