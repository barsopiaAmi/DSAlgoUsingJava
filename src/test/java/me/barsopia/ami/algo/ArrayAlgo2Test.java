package me.barsopia.ami.algo;

import org.junit.Assert;
import org.junit.Test;

public class ArrayAlgo2Test {
    @Test
    public void testMaxPair() {
        int[] stack1 = {4, 2, 4, 6, 1};
        ArrayAlgo2 a = new ArrayAlgo2();
        int t = a.getMaxSumPair(stack1);
        Assert.assertEquals(10, t);
    }

    @Test
    public void testMaxPair1() {
        int[] stack1 = {4, 2, 4, 6, 1};
        int[] stack2 = {2, 1, 8, 5};
        Assert.assertEquals(14, new ArrayAlgo2().getMaxSumPair(stack1, stack2));
    }

    @Test
    public void testMaxPairDiffConst() {
        int[] stack1 = {4, 2, 4, 6, 1};
        ArrayAlgo2 a = new ArrayAlgo2();
        int t = a.getMaxSumPairDiffConst(stack1);
        Assert.assertEquals(8, t);
    }
}

