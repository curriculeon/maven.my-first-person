package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 7/15/2020.
 */
public class SetNickname {
    private void test(String expected) {
        // Given
        Person person = new Person();
        
        // When
        person.setNickname(expected);
        String actual = person.getNickname();
        
        // Then
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void test0() {
        //Validate before setting
        test(null);
    }
    
    
    @Test
    public void test1() {
        test("Dan Winter");
    }
    
    
    
    @Test
    public void test2() {
        test("David Berlinski");
    }
    
    
    
    @Test
    public void test3() {
        test("Steven C Meyers");
    }
    
    
    
    @Test
    public void test4() {
        test("Heart Harmonics");
    }
    
    
    @Test
    public void test5() {
        test("Phase Conjugate Negentropic Charge Collapse");
    }
}
