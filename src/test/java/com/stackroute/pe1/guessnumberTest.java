package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class guessnumberTest {

    @Test
    public void givenAnIntegerInputShouldReturnEqualStatusOfInput() {
        //arrange
        guessnumber g= new guessnumber();
        //act
        int actualResult=g.guesser(34);

        //assert
        assertEquals("The number you entered is 34 and is guessed properly",actualResult);

    }



}