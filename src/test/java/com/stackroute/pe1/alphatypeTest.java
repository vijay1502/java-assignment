package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class alphatypeTest {

    @Test
    public void givenAStringShouldReturnVowelsAndConsonants() {
        //arrange

        //act
        String actualResult=alphatype.vowelcons("vijay");
        //assert
        assertEquals("vijay",actualResult);
    }
}