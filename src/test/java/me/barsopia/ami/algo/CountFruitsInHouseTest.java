package me.barsopia.ami.algo;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class CountFruitsInHouseTest {

    @Test

    public void testCase1() {
        CountFruitsInHouse countFruitsInHouse = new CountFruitsInHouse();
        int[] actualOutput = new int[]{1, 1};
        int s = 7, t = 11, a = 5, b = 15;
        int[] apples = new int[]{-2, 2, 1};
        int[] oranges = new int[]{5, -6};
        assertArrayEquals(actualOutput, countFruitsInHouse.countFruits(s, t, a, b, apples, oranges));
    }

    @Test

    public void testCase2() {
        CountFruitsInHouse countFruitsInHouse = new CountFruitsInHouse();
        int[] actualOutput = new int[]{1, 1};
        int s = 2, t = 3, a = 1, b = 5;
        int[] apples = new int[]{2};
        int[] oranges = new int[]{-2};
        assertArrayEquals(actualOutput, countFruitsInHouse.countFruits(s, t, a, b, apples, oranges));
    }
}