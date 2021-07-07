package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

/**
 * Created by leon on 7/15/2020.
 */
public class SetBirthday {
    private void test(LocalDateTime expected) {
        // Given
        Person person = new Person();
        
        // When
        person.setBirthday(expected);
        LocalDateTime actual = person.getBirthday();
        
        // Then
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void test0() {
        LocalDateTime localDateTime = null;
        Person person = new Person();
        //Validate before even setting it into Person
        Assert.assertThrows(NullPointerException.class, () -> localDateTime.getClass());
    }
    
    
    @Test
    public void test1() {
        test(LocalDateTime.now());
    }
    
    
    @Test
    public void test2() {
        test(LocalDateTime.of(1992,2,28,1,1,1));
    }
}
