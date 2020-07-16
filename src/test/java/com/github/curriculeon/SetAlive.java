package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 7/15/2020.
 */
public class SetAlive {
    private void test(Boolean expected) {
        // Given
        Person person = new Person();
        
        // When
        person.setAlive(expected);
        boolean actual = person.isAlive();
        
        // Then
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void test0() {
        Boolean alive = null;
        Person person = new Person();
        //Validate before even setting it into Person
        Assert.assertThrows(NullPointerException.class, () -> person.setAlive(alive));
    }
    
    
    @Test
    public void test1() {
        test(true);
    }
    
    
    @Test
    public void test2() {
        test(false);
    }
}
