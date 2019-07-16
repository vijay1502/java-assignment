package com.stackroute.pe1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerPalindromeAndEvenSumTest {
    private static IntegerPalindromeAndEvenSum integerPalindromeAndEvenSum;
    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        integerPalindromeAndEvenSum = new IntegerPalindromeAndEvenSum();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        integerPalindromeAndEvenSum = null;

    }


    @Test
   public void givenAnIntegerShouldReturnPalindromeString(){
        //arrange

        IntegerPalindromeAndEvenSum palindrome=new IntegerPalindromeAndEvenSum();
        //act
        int actualResult= palindrome.palindromeOrNot(12321);

        //assert
        assertEquals("12321 is a palindrome number",actualResult);
    }

    @Test
    public void givenANonPalindromeIntegerShouldReturnNonPalindromeString(){
        //arrange

        IntegerPalindromeAndEvenSum palindrome=new IntegerPalindromeAndEvenSum();
        //act
        int actualResult= palindrome.palindromeOrNot(12332);

        //assert
        assertEquals("12332 is not a Palindrome",actualResult);
    }

    @Test
    public void givenAnIntegerShouldReturnSumOfEvenNumbers(){
        //arrange

        IntegerPalindromeAndEvenSum palindrome=new IntegerPalindromeAndEvenSum();
        //act
        int actualResult= palindrome.palindromeSum(12332);

        //assert
        assertEquals(4,actualResult);
    }
}