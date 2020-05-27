package me.barsopia.ami.algo;

import org.junit.Assert;
import org.junit.Test;

public class ArrayAlgo1Test {
    @Test
    public void testMaxNumber() {
        int[] array = {4, 2, 4, 6, 1};
        Assert.assertEquals(6, new ArrayAlgo1().getMaxElement(array));
    }

    @Test
    public void testMaxNumber1() {
        int[] array = {0, -1, -3};
        Assert.assertEquals(0, new ArrayAlgo1().getMaxElement(array));
    }

    @Test
    public void testminNumber() {
        int[] array = {-1, 2, 4, 6, 1};
        Assert.assertEquals(-1, new ArrayAlgo1().getMinElement(array));
    }

    @Test
    public void testMmiNumber1() {
        int[] array = {5, 10, 15};
        Assert.assertEquals(5, new ArrayAlgo1().getMinElement(array));
    }
}