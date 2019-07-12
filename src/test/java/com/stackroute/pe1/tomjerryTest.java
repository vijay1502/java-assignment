package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class tomjerryTest {

    @Test
    public void givenAnIntegerShouldReturnStringAsJerry() {
        //arrange
        tomjerry next = new tomjerry();
        //act
        String actualResult=next.compareeven(26);
        //assert
        assertEquals("jerry",actualResult);
    }

    @Test
    public void givenAnIntegerShouldReturnStringAsTom() {
        //arrange
        tomjerry next = new tomjerry();
        //act
        String actualResult=next.compareeven(23);
        //assert
        assertEquals("tom",actualResult);
    }

}

