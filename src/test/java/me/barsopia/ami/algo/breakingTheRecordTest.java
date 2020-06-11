package me.barsopia.ami.algo;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class breakingTheRecordTest {

    @Test

    public void testCase1() {
        breakingTheRecord breakingTheRecord = new breakingTheRecord();
        int[] output = breakingTheRecord.breakingRecords(new int[]{10, 5, 20, 20, 4, 5, 2, 25, 1});
        int[] actualOutPut = new int[]{2, 4};
        assertArrayEquals(actualOutPut, output);
    }
}