package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class ConstrucgorWithStringIntegerAndDoubles {
    private void test(String expectedName, Integer expectedAge, String expectedLastName, Integer exceptedWeight,
                      double expectedHeight, String expectedHairColor, LocalDate expectedBirthDate) {

        // When
        Person person = new Person(expectedName, expectedAge,expectedLastName,
                exceptedWeight,expectedHeight,expectedHairColor,expectedBirthDate);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();
        String actualLastName = person.getLastName();
        Integer actualWeight = person.getWieght();
        double actualHeight = person.getHeight();
        String actualHairColor = person.getHairColor();
        LocalDate actualBday = person.getBirthDate();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedLastName,actualLastName);
        Assert.assertEquals(exceptedWeight,actualWeight);
        Assert.assertEquals(expectedHeight,actualHeight,0.0);
        Assert.assertEquals(expectedHairColor,actualHairColor);
        Assert.assertEquals(actualBday, expectedBirthDate);
    }

    @Test
    public void test0() {
        test("bill",33,"kin",143,5.10,"black",LocalDate.of(1973, 3, 3));
    }
    @Test
    public void test1() {
        test("carl",45,"smith",173,5.06,"bald",LocalDate.of(1973, 3, 3));
    }
    @Test
    public void test2() {
        test("Karen",27,"smith",123,5.09,"bald",LocalDate.of(1993, 7, 4));
    }
}
