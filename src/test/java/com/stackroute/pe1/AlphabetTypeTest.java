package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlphabetTypeTest {

    AlphabetType alphabetType;
    @Before
    public void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        alphabetType = new AlphabetType();

    }

    @After
    public void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        alphabetType = null;

    }


    @Test
    public void givenAStringShouldReturnStringArray()  {

        String[] result={"consonant,vowel,consonant,vowel,consonant"};
        String[] actualResult=alphabetType.vowelAndConsonantFinder("Vijay");
        assertArrayEquals(result,actualResult);
    }

}