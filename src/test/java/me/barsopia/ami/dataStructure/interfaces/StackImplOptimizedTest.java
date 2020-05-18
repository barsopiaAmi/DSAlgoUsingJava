package me.barsopia.ami.dataStructure.interfaces;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StackImplOptimizedTest {
    @Test(expected = IllegalStateException.class)
    public void basicTest() {
        int[] ints = {1, 2, 3};
        StackImplOptimized stackImplOptimized = new StackImplOptimized(ints);
        assertEquals(3, stackImplOptimized.getSizeOfStack());

        //when
        int pop = stackImplOptimized.pop();

        //then
        assertEquals(1, pop);
        assertEquals(2, stackImplOptimized.getSizeOfStack());

        //when
        pop = stackImplOptimized.pop();

        //then
        assertEquals(2, pop);

        //when
        pop = stackImplOptimized.pop();

        //then
        assertEquals(3, pop);

        //when
        pop = stackImplOptimized.pop();

        //then
        assertEquals(3, pop);
    }

}