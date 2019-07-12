package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class alphatypeTest {

    @Test

    public void givenAStringShouldReturnVowelsAndConsonants() {
        //arrange
        alphatype at= new alphatype();
        //act
        String actualResult=at.vowelcons("v");
        //assert
        assertEquals("consonant",actualResult);
    }
}