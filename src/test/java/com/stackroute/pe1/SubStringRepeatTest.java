package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubStringRepeatTest {
SubStringRepeat subStringRepeat;
    @Before
    public void setUp() throws Exception {
        subStringRepeat=new SubStringRepeat();
    }

    @After
    public void tearDown() throws Exception {
        subStringRepeat=null;
    }
    @Test
    public void givenAStringShouldReturnRepeatedSubString(){
        String actualResult=subStringRepeat.stringRepeatingMethod("Vijay",2);
        assertEquals("Vijayayay",actualResult);
    }
    @Test
    public void givenAStringShouldReturnErrorIfNull(){
        String actualResult=subStringRepeat.stringRepeatingMethod(null,2);
        assertEquals("null is not allowed",actualResult);
    }

}