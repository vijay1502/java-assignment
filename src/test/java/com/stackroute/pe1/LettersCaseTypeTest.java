package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LettersCaseTypeTest {

    LettersCaseType letterCase;
    @Before
    public void setup(){
        this.letterCase=new LettersCaseType();
    }


    @Test
    public void givenAStringShouldReturnStringAsSmall() {

    String actualResult=letterCase.letterTypeMethod("a");
    assertEquals("Small Letter",actualResult);
    }

    @Test
    public void givenAStringShouldReturnStringAsCapital() {

        String actualResult=letterCase.letterTypeMethod("A");
        assertEquals("Capital Letter",actualResult);

    }

    @Test
    public void givenAStringAndNullShouldReturnErrorMessage(){

        //act
        String actualResult=letterCase.letterTypeMethod(null);
        //assert
        assertNotNull(actualResult);
        assertEquals("Null Value Not Allowed",actualResult);
    }
}