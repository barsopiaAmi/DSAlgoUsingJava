package me.barsopia.ami.algo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class kangarooProblemTest {

    @Test
    public void testCase1() {
        kangarooProblem kangarooProblem = new kangarooProblem();
        String result = kangarooProblem.kangarooMeets(0, 2, 5, 3);
        assertEquals("NO", result);
    }

    @Test
    public void testCase2() {
        kangarooProblem kangarooProblem = new kangarooProblem();
        String result = kangarooProblem.kangarooMeets(28, 8, 96, 2);
        assertEquals("NO", result);
    }

    @Test
    public void testCase3() {
        kangarooProblem kangarooProblem = new kangarooProblem();
        String result = kangarooProblem.kangarooMeets(21, 6, 47, 3);
        assertEquals("NO", result);
    }
}
