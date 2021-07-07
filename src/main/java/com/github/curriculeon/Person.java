package com.github.curriculeon;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    String name;
    Integer age;
    char gender;
    double weight;
    boolean alive;


    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
    }

    public Person(Integer age) {
        this.age = age;
    }

    public Person(String name) {
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

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public String getName() {

        return name;
    }

    public Integer getAge() {

        return age;
    }

    public char getGender() {

        return gender;
    }

    public double getWeight() {

        return weight;
    }

    public boolean getAlive() {

        return alive;
    }
}
