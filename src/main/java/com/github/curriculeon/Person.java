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
    //public Person(int age) {
        //this.age = (age!=0) ? age : null;
        this.age = age;
        this.name = null;
    }

    public Person(String name) {
        this.name = name;
        this.age = Integer.MAX_VALUE;
    }
    public Person(String name, Integer age) {
    //public Person(String name, int age) {
        this.name = name;
        //this.age = (age!=0) ? age : null;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
    //public void setAge(int age) {
       //this.age = (age!=0) ? age : null;
        this.age = age;
    }

    public String getName() {
        return name;
        //return null;
    }

    public Integer getAge() {
        return age;
        //return null;
    }
}
