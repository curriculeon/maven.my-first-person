package com.github.curriculeon;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    
    //Attributes
    private int age = Integer.MAX_VALUE;
    private String name = "";
    private boolean alive = true;
    private LocalDateTime birthday = LocalDateTime.now();
    private String nickname = "Bob";
    
    
    //Start Constructors
    public Person() {
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //End Constructors

    //Start Methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void setAlive(boolean alive) {
        this.alive = alive;
    }
    
    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }
    
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    
    public boolean isAlive() {
        return alive;
    }
    
    public LocalDateTime getBirthday() {
        return birthday;
    }
    
    public String getNickname() {
        return nickname;
    }
    
    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }
    
    
    //End Methods
}
