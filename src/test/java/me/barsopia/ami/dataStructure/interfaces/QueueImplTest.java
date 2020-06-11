package me.barsopia.ami.dataStructure.interfaces;

import me.barsopia.ami.algo.QueueAlgoUsingTwoStack;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class QueueImplTest {

    private static final Scanner scanner = new Scanner(System.in);
    private final int capacity = 20;
    Queue q;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        //test your code
        int n = scanner.nextInt();
        Queue s = new QueueAlgoUsingTwoStack();
        for (int i = 0; i < n; i++) {
            switch (scanner.nextInt()) {
                case 1:
                    s.add(scanner.nextInt());
                    break;
                case 2:
                    s.remove();
                    break;
                case 3:
                    int max = s.peek();
                    System.out.println(max);
                    break;
            }
        }

        scanner.close();
    }

    private Queue getImpl() {
        return new QueueAlgoUsingTwoStack();
    }


    @Before
    public void beforeEachTest() {
        q = getImpl();
    }

    @Test

    public void testCase1() {
        q.add(42);
        q.remove();
        q.add(14);
        assertEquals(14, q.peek());
        q.add(28);
        assertEquals(14, q.peek());
        q.add(60);
        q.add(78);
        assertEquals(14, q.remove());
        assertEquals(28, q.remove());
    }

    @Test(expected = IllegalStateException.class)
    public void testCaseEmpty() {
        q.remove();
    }

    @Test(expected = IllegalStateException.class)
    public void testCaseEmptyAfterInserts() {
        q.add(42);
        q.remove();
        q.remove();
    }

    @Test
    public void testCaseFull() {
        q.add(14);
        q.add(78);
        q.add(60);
        q.add(78);
        q.add(60);
        q.add(78);
        q.add(60);
        q.add(78);
        q.add(60);
        q.add(78);
        q.add(60);
        q.add(78);
        q.add(60);
        q.add(78);
        assertEquals(14, q.peek());
    }

    @Test
    public void testCaseFullCapacity() {
        q.add(14);
        for (int i = 0; i < capacity; i++) {
            q.add(10);
        }

        assertEquals(14, q.peek());
    }

    @Test

    public void testCase2() {
        q.add(76);
        q.remove();
        q.add(33);
        q.add(23);
        q.add(97);
        q.add(21);
        assertEquals(33, q.peek());
        assertEquals(33, q.peek());
        q.add(74);
        assertEquals(33, q.peek());
    }
}
