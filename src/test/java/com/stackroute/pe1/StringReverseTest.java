package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverseTest {
    StringReverse stringReverse;
    @Before
    public void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        stringReverse = new StringReverse();

    }

    @After
    public void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        stringReverse = null;

    }



    @Test
        public void givenAStringShouldReturnReverseAsOutput() {
            //arrange
            StringReverse wordObject= new StringReverse();
            //act
            String actualResult=wordObject.reverse("vijay");
            //assert
            assertEquals("yajiv",actualResult);
        }
    @Test
    public void givenNullShouldReturnErrorMessage() {

        //arrange
        StringReverse g = new StringReverse();
        //act
        String actualResult=g.reverse(null);
        //assert
        assertNotNull(actualResult);
        assertEquals("Null Value Not Allowed",actualResult);
    }
    @Test
    public void givenNullShouldReturnMessageStringIfInputIsSingleValue() {

        //arrange
        StringReverse g = new StringReverse();
        //act
        String actualResult=g.reverse("a");
        //assert
        assertNotNull(actualResult);
        assertEquals("Single value can't be reversed",actualResult);
    }
    }
