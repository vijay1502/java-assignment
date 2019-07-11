package com.stackroute.pe1;

import org.junit.*;


import static org.junit.Assert.*;

public class junitTest2Test {
    junitTest2 junitTest2;
    @Before
    public void setUp(){
        //arrange
        System.out.println("Inside Before");
        this.junitTest2= new junitTest2();
    }

    @After
    public void tearDown(){
        System.out.println("Inside After");
        junitTest2=null;
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before Class");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("After Class");
    }

    @Test
    public void givenTwoStringsShouldReturnConcatedUpperString() {

        //act
        String actualResult=junitTest2.concatAndUpperCase("hello","world");
        //assert
        assertNotNull(actualResult);
        assertEquals("HELLOWORLD",actualResult);


    }
    @Test
    public void givenAStringAndNullShouldReturnErrorMessage(){

        //act
        String actualResult=junitTest2.concatAndUpperCase("hello",null);
        //assert
        assertNotNull(actualResult);
        assertEquals("Null Value Not Allowed",actualResult);
    }
    @Test
    public void givenStringShouldReturnTheReverse(){
        //act
        String actualResult=junitTest2.reverseString("Hello");
        //Assert
        assertEquals("olleH",actualResult);
    }
//    @Test
//    public void givenNullShouldThrowNullPointException(){
//        //act
//        String actualResult=junitTest2.reverseString(null);
//

}