package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class tomjerryTest {

    @Test
    public void givenAnIntegerShouldReturnTomOrJerry() {
        //arrange
        tomjerry next = new tomjerry();
        //act
        int actualResult=next.compareeven(26);
        //assert
        assertEquals(26,actualResult);
    }
}