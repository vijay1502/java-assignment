package com.stackroute.pe1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlphabetTypeTest {

    private static AlphabetType alphabetType;
    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        alphabetType = new AlphabetType();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        alphabetType = null;

    }


    @Test
    public void givenAStringShouldReturnStringTypeOfAlphabet()  {
        AlphabetType alphabet=new AlphabetType();
        String actualResult=alphabet.vowelAndConsonant("V");


        assertEquals("consonant",actualResult);
    }

    @Test
    public void givenAStringShouldReturnStringTypeAsVowel()  {
        AlphabetType alphabet=new AlphabetType();
        String actualResult=alphabet.vowelAndConsonant("a");
        assertEquals("vowel",actualResult);
    }


}