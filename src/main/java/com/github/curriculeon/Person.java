package com.github.curriculeon;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private Integer number= Integer.MAX_VALUE;
    private String word ="";
    public Person() {
    }

    public Person(Integer age) {
      number=age;

    }

    public Person(String name) {
        word=name;
    }

    public Person(String name, Integer age) {
        number=age;
        word=name;
    }

    public void setName(String name) {
        word=name;
    }

    public void setAge(Integer age) {
        number=age;
    }

    public String getName() {

        return word;
    }

    public Integer getAge() {
        return number;

    }
}
