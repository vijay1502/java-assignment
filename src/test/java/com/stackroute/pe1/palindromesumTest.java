package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class palindromesumTest {
    palindromesum p=new palindromesum();
    @Test
   public void givenAnIntegerShouldReturnPalindrome(){
        //arrange


        //act
        int actualResult= p.palindromeChecker(12321);

        //assert
        assertEquals(12321,actualResult);
    }
}