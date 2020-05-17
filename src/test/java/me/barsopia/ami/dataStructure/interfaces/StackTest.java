package me.barsopia.ami.dataStructure.interfaces;

import me.barsopia.ami.dataStructure.implementations.StackImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class StackTest {
    Stack<Integer> s;

    private StackImpl<Integer> getImpl() {
        return new StackImpl<Integer>(10);
    }

    private void assertListEquals(List<Integer> expected, List<Integer> actual) {
        assertEquals("different array size", expected.size(), actual.size());
        for (int i = 0; i < actual.size(); i++) {
            assertEquals("different at index:" + i, expected.get(i), actual.get(i));
        }
    }

    @Before
    public void beforeEachTest() {
        s = getImpl();
    }

    @Test
    public void insertElement() {
        //given

        //when
        s.push(10);

        //then
        List<Integer> t = Arrays.asList(new Integer[10]);
        t.set(0, 10);
        List<Integer> allElement = s.getAllElement();
        assertListEquals(t, allElement);
    }

    @Test
    public void popElement() {
        //given
        s.push(10);
        //when
        int popValue = s.pop();
        //then
        assertEquals(10, popValue);
    }

    @Test
    public void multipleInsertMultiplePopElement() {
        //given
        s.push(10);
        s.push(100);
        s.push(1000);
        s.push(10000);
        //when
        s.pop();
        s.pop();
        int popValue = s.pop();
        //then
        assertEquals(100, popValue);
    }

    @Test
    public void testSizeMethod() {
        //given
        s.push(100);
        //when
        int sizeOfStack = s.getSizeOfStack();
        //then
        assertEquals(1, sizeOfStack);
    }

    @Test
    public void testCapacityIncrease() {

        //given
        s.push(10);
        s.push(10);
        s.push(10);
        s.push(10);
        s.push(10);
        s.push(10);
        s.push(10);
        s.push(10);
        s.push(10);
        s.push(10);
        s.push(100);
        s.push(1000);
        s.push(10000);
        //when
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        int popValue = s.pop();
        //then
        assertEquals(10, popValue);
    }
}