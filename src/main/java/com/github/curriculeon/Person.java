package com.github.curriculeon;

import java.util.Date;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
     String name="";
     Integer age;
     Date birthDate;
     String address;
     char gender;

    public Person() {
        this.name="";
        this.age=Integer.MAX_VALUE;
    }

    public Person(Integer age) {
        this.age=age;
        this.name="";
    }

    public Person(String name) {
        this.name=name;
        this.age=null;
    }

    public Person(String name, Integer age) {
        this.name=name;
        this.age=age;

    }

    public void setName(String name) {
        this.name=name;
    }

    public void setAge(Integer age) {
        this.age=age;
    }

    public String getName() {

        return this.name;
    }

    public Integer getAge() {

        return this.age;
    }
}
