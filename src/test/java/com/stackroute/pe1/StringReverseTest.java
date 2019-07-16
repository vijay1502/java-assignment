package com.stackroute.pe1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverseTest {
    private static StringReverse stringReverse;
    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        stringReverse = new StringReverse();

    }

    @AfterClass
    public static void teardown() {
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
            String actualresult=g.reverse(null);
            //assert
            assertNotNull(actualresult);
            assertEquals("Should Not Be Null", actualresult);

        }
    }
