package me.barsopia.ami.algo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class migratoryBirdTest {

    @Test
    public void testCase1() {
        migratoryBird migratoryBird = new migratoryBird();
        int[] input = new int[]{1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4};
        int output = migratoryBird.migratoryBirds(input);
        assertEquals(3, output);
    }

}