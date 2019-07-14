package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class GuessNumberTest {

    @Test
    public void givenAnIntegerInputShouldReturnStringWhichMatchesInputValue() {
        //arrange
        GuessNumber number= new GuessNumber();
        //act
        String actualResult=number.guessOutput(34);

        //assert
        assertEquals("The value matches",actualResult);
    }

    @Test
    public void givenAnIntegerInputShouldReturnStringIsGreaterThanInputGiven() {
        //arrange
        GuessNumber number= new GuessNumber();
        //act
        String actualResult=number.guessOutput(38);

        //assert
        assertEquals("The number you entered is 38 and is 4 greater than the original number",actualResult);
    }


    @Test
    public void givenAnIntegerInputShouldReturnStringIsLesserThanInputGiven() {
        //arrange
        GuessNumber number= new GuessNumber();
        //act
        String actualResult=number.guessOutput(32);

        //assert
        assertEquals("The number you entered is 32 and is 2 Lesser than the original number",actualResult);
    }


}