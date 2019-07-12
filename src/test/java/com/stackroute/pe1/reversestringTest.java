package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class reversestringTest {

    @Test
    public void givenAStringShouldReturnReverseAsOutput() {
        //arrange
        reversestring g= new reversestring();
        //act
        String actualResult=g.reverse("vijay");
        //assert
        assertEquals("yajiv",actualResult);
    }


    @Test
    public void givenNullShouldReturnErrorMessage() {

        //arrange
        reversestring g = new reversestring();
        //act
        String actualresult=g.reverse(null);
        //assert
        assertNotNull(actualresult);
        assertEquals("Should Not Be Null", actualresult);

    }
}