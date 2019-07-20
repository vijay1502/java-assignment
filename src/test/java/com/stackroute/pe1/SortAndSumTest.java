package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortAndSumTest {
SortAndSum sortAndSum;
    @Before
    public void setUp() throws Exception {
        sortAndSum=new SortAndSum();
    }

    @After
    public void tearDown() throws Exception {
        sortAndSum=null;
    }

    @Test
    public void givenAnInputIntegerShouldReturnDescendingOrder(){
        String actualResult=sortAndSum.DescendingOrderSorting(4253);
        assertEquals(5432,actualResult);
    }
}