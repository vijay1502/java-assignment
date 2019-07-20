package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerPalindromeAndEvenSumTest {
     IntegerPalindromeAndEvenSum integerPalindromeAndEvenSum;
    @Before
    public void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        integerPalindromeAndEvenSum= new IntegerPalindromeAndEvenSum();

    }

    @After
    public void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        integerPalindromeAndEvenSum = null;

    }


    @Test
   public void givenAnIntegerShouldReturnPalindromeString(){
        //arrange

        IntegerPalindromeAndEvenSum palindrome=new IntegerPalindromeAndEvenSum();
        //act
        String actualResult= integerPalindromeAndEvenSum.palindromeChecker(12321);

        //assert
        assertEquals("Given number is a palindrome",actualResult);
    }

    @Test
    public void givenANonPalindromeIntegerShouldReturnNonPalindromeString(){

        String actualResult= integerPalindromeAndEvenSum.palindromeChecker(12332);

        //assert
        assertEquals("Given number is not a palindrome",actualResult);
    }

    @Test
    public void givenAnIntegerShouldReturnSumOfEvenNumbers(){

        int actualResult= integerPalindromeAndEvenSum.evenNumberSum(12332);

        //assert
        assertEquals(4,actualResult);
    }
}