package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class ArraySumTest {
    ArraySum arraySum;
    @Before
    public void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        arraySum = new ArraySum();

    }

    @After
    public void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        arraySum = null;

    }

    @Test
    public void givenAnIntegerArrayShouldReturnTheSumOfArrayElements(){
        int[] arrayInput={10,20,30};
        String actualOutput=arraySum.arraySumMethod(arrayInput);
        assertEquals("SUm of array Elements is 60",actualOutput);
       }



}