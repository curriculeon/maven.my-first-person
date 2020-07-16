package com.github.curriculeon;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private Integer age;
    private String name;

    public Person() {
        this("", Integer.MAX_VALUE);
    }

    public Person(Integer age) {
        this(null, age);
    }

    public Person(String name) {
        this(name, null);
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
