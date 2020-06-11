package me.barsopia.ami.algo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class divisibleSumPairTest {

    @Test
    public void testCase1() {
        divisibleSumPair divisibleSumPair = new divisibleSumPair();
        int[] inputData = new int[]{1, 3, 2, 6, 1, 2};
        int output = divisibleSumPair.divisibleSumPairs(6, 3, inputData);
        assertEquals(5, output);
    }
}