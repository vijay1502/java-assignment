package com.stackroute.pe1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class NumberRepeatingSequenceTest {
    NumberRepeatingSequence numberRepeat;
    public void setUp(){
        //arrange
        System.out.println("Inside Before");
        this.numberRepeat = new NumberRepeatingSequence();
    }

    @After
    public void tearDown(){
        System.out.println("Inside After");
        numberRepeat=null;
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before Class");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("After Class");
    }




    @Test
    public void givenAnIntegerShouldReturnRepetingCount(){
    //arrange
        NumberRepeatingSequence numberRepeat= new NumberRepeatingSequence();
        //act
        int actualResult=numberRepeat.repeatingNumberMethod(4);
        //assert
        assertEquals(10,actualResult);

    }

}