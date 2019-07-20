package com.stackroute.pe1;

import org.junit.After;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberRepeatingSequenceTest {

    NumberRepeatingSequence numberRepeatingSequence;
    @Before
    public void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        numberRepeatingSequence = new NumberRepeatingSequence();

    }

    @After
    public void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        numberRepeatingSequence = null;

    }





    @Test
    public void givenAnIntegerShouldReturnRepetingCount(){

        int[] output={1,2,2,3,3,3};
    int[] actualresult = numberRepeatingSequence.repeatingNumberMethod(3);
    assertArrayEquals(output,actualresult);

    }

}