package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class integerPalindromeAndEvenSumTest {

    @Test
   public void givenAnIntegerShouldReturnPalindromeString(){
        //arrange

        IntegerPalindromeAndEvenSum palindrome=new IntegerPalindromeAndEvenSum();
        //act
        int actualResult= palindrome.palindromeAndSumMethod(12321);

        //assert
        assertEquals("It is a Palindrome",actualResult);
    }

    @Test
    public void givenANonPalindromeIntegerShouldReturnNonPalindromeString(){
        //arrange

        IntegerPalindromeAndEvenSum palindrome=new IntegerPalindromeAndEvenSum();
        //act
        int actualResult= palindrome.palindromeAndSumMethod(12332);

        //assert
        assertEquals("It is not a Palindrome",actualResult);
    }
}