package com.stackroute.pe1;

import org.junit.After;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NumberRepeatingSequenceTest {

    private static NumberRepeatingSequence numberRepeatingSequence;
    @Before
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        numberRepeatingSequence = new NumberRepeatingSequence();

    }

    @After
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        numberRepeatingSequence = null;

    }





    @Test
    public void givenAnIntegerShouldReturnRepetingCount(){

    //arrange
        NumberRepeatingSequence numberRepeat=new NumberRepeatingSequence();
    int actualresult = numberRepeat.repeatingNumberMethod(4);

    assertEquals(10,actualresult);

    }

}