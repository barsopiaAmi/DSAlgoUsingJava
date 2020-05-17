package me.barsopia.ami.algo;

import me.barsopia.ami.dataStructure.implementations.StackImpl;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackAlgo2Test {

    @Test
    public void functionIsBalanced() {
        StackAlgo2 s = new StackAlgo2();
        assertTrue(s.isBalanced("{[()]}"));
    }

    @Test
    public void functionIsBalancedTestCase2() {
        StackAlgo2 s = new StackAlgo2();
        assertFalse(s.isBalanced("{[(])}"));
    }

    @Test
    public void functionIsBalancedTestCase3() {
        StackAlgo2 s = new StackAlgo2();
        assertTrue(s.isBalanced("{{[[(())]]}}"));
    }

    @Test
    public void functionIsBalancedTestCase4() {
        StackAlgo2 s = new StackAlgo2();
        assertFalse(s.isBalanced("{{[[(())]]()))))))))))}"));
    }

    @Test
    public void functionIsBalancedTestCase5() {
        StackAlgo2 s = new StackAlgo2();
        assertTrue(s.isBalanced("()()()()()()"));
    }
}