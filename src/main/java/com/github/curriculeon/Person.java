package com.github.curriculeon;

/**
 * Created by leon on 2/12/18.
 */
public class Person {

    Integer age1=null;
    String name1=null;

    public  Person() {
        name1="";
        age1=Integer.MAX_VALUE;
    }

    public Person(String a) {
        name1=a;
    }

    public Person(Integer a){
       age1=a;

    }

    public int Person(int age) {
        if (age != '\0') {
            age1 = age;
           }
        return (age1);
    }
    public String Person(String name) {
        if (!name.isEmpty()) {
            name1 = name;
        }
        return (name1);
    }
    public Person(String name, int age) {
        name1=name;
        age1=age;
    }

    public Person(String name, Integer age) {
        name1=name;
        age1=age;
    }

    public void setName(String name) {
        name1=name;
    }

    public void setAge(int age) {
        age1=age;
    }

    public void setAge(Integer age) {
        age1=age;
     }


    public String getName() {
        return name1;
    }

    public Integer getAge() {
        return age1;
    }
}
