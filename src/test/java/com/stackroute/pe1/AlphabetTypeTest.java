package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class AlphabetTypeTest {

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