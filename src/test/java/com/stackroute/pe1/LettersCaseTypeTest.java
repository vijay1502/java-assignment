package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LettersCaseTypeTest {

    LettersCaseType letterCase;
    @Before
    public void setup(){
       letterCase=new LettersCaseType();
    }
    @After
    public void tearDown(){
        letterCase=null;
    }


    @Test
    public void givenAStringShouldReturnStringAsSmall() {

    String[] output={"Capital Letter","Small Letter","Small Letter"};
    String[] actualResult=letterCase.letterCaseMethod("Vij");
    assertArrayEquals(output,actualResult);
    }

    @Test
    public void givenAStringShouldReturnStringAsCapital() {
        String[] output={"Capital Letter","Small Letter","Given String is not an alphabet"};
        String[] actualResult=letterCase.letterCaseMethod("Vi$");
        assertArrayEquals(output,actualResult);

    }


}