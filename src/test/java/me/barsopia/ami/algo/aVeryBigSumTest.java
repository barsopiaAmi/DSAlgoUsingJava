package me.barsopia.ami.algo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class aVeryBigSumTest {

    @Test
    public void TestCase1() {
        aVeryBigSum aVeryBigSum = new aVeryBigSum();
        long[] dataSet = new long[]{1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
        aVeryBigSum.aVeryBigSum(dataSet);
        long t = aVeryBigSum.aVeryBigSum(dataSet);
        assertEquals(new Long("5000000015"), new Long(t));


    }
}