package com.github.curriculeon;

import java.time.LocalDate;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    String name ="" ;
    Integer age = Integer.MAX_VALUE;

    String lastName;


    int wieght;

    double  height;

    String hairColor;



    LocalDate birthDate;

    public Person() {
    }

    public Person(Integer age) {
         this.age = age;

    }


    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Integer age) {
        this.age = age;
        this.name = name;
    }



    public Person(String name, Integer age, String lastName, int wieght, double height, String hairColor, LocalDate birthDate) {
        this.name = name;
        this.age = age;
        this.lastName = lastName;
        this.wieght = wieght;
        this.height = height;
        this.hairColor = hairColor;
        this.birthDate = birthDate;
    }
    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getWieght() {
        return wieght;
    }

    public void setWieght(int wieght) {
        this.wieght = wieght;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
