package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class conditionBasedOutputTest {

    @Test
    public void givenAnIntegerShouldReturnStringAsJerry() {
        //arrange
        ConditionBasedOutput next = new ConditionBasedOutput();
        //act
        String actualResult=next.compareCondition(26);
        //assert
        assertEquals("jerry",actualResult);
    }

    @Test
    public void givenAnIntegerShouldReturnStringAsTom() {
        //arrange
        ConditionBasedOutput next = new ConditionBasedOutput();
        //act
        String actualResult=next.compareCondition(23);
        //assert
        assertEquals("tom",actualResult);
    }

}



