package com.github.curriculeon;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private Integer personAge;
    private String personName;
    private String personGender;
    private Integer personHeight;


    public Person() { //Default Construct
        this(null,null);
    }

    public Person(Integer age) { //Constructor where only age is given
        this("", age);

    }

    public Person(String name) {
       this(name, null);

    }

    public Person(String name, Integer age) {
       personName = name;
       personAge = age;
    }

    public void setName(String name) {
        personName = name;
    }

    public void setAge(Integer age) {
        personAge = age;
    }

    public String getName() {
        return personName;
    }

    public Integer getAge() {
        return personAge;
    }
}
