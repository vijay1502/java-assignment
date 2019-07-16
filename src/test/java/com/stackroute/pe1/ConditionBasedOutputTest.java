package com.stackroute.pe1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConditionBasedOutputTest {
    private static ConditionBasedOutputTest conditionBasedOutputTest;
    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        conditionBasedOutputTest = new ConditionBasedOutputTest();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        conditionBasedOutputTest = null;

    }


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



