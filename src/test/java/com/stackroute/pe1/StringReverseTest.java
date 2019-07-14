package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverseTest {


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
            String actualresult=g.reverse(null);
            //assert
            assertNotNull(actualresult);
            assertEquals("Should Not Be Null", actualresult);

        }
    }
