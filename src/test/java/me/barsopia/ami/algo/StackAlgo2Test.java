package me.barsopia.ami.algo;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void functionIsBalancedTestCase6() {
        StackAlgo2 s = new StackAlgo2();
        assertFalse(s.isBalanced("}][}}(}][))]"));
    }
}