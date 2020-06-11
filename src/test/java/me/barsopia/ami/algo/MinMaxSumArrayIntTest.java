package me.barsopia.ami.algo;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MinMaxSumArrayIntTest {

    @Test
    public void TestCase2() {
        MinMaxSumArrayInt minMaxSumArrayInt = new MinMaxSumArrayInt();
        int[] input = new int[]{396285104, 573261094, 759641832, 819230764, 364801279};
        long[] expectedOutput = new long[]{2093989309, 2548418794l};
        assertArrayEquals(expectedOutput, minMaxSumArrayInt.calculateSumOfArrayElements(input));
    }
}