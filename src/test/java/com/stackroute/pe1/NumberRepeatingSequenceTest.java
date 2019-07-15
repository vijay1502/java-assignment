package com.stackroute.pe1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NumberRepeatingSequenceTest {






    @Test
    public void givenAnIntegerShouldReturnRepetingCount(){

    //arrange
        NumberRepeatingSequence numberRepeat=new NumberRepeatingSequence();
    int actualresult = numberRepeat.repeatingNumberMethod(4);

    assertEquals(10,actualresult);

    }

}