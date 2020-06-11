package me.barsopia.ami.algo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class completeSetTest {

    @Test
    public void count() {
        List<Integer> inputDataArray1 = new ArrayList(Arrays.asList(2, 4));
        List<Integer> inputDataArray2 = new ArrayList(Arrays.asList(16, 32, 96));
        completeSet.CountFinder countFinder = new completeSet.CountFinder(inputDataArray1, inputDataArray2);
        assertEquals(4, countFinder.getLcm());
        int[] multiples = {0, 4, 8, 12, 16, 20, 24, 28, 32, 36, 40, 44, 48, 52, 56, 60, 64, 68, 72, 76, 80, 84, 88, 92, 96};
        assertArrayEquals(multiples, countFinder.getMultiples(4));
        assertEquals(3, countFinder.getCount(multiples));

        ExecutorService e = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 100; i++) {
            int finalI = i;
            e.submit(new Runnable() {
                @Override
                public void run() {
                    while (true) System.out.print(finalI);
                }
            });
        }
        while (true) {
            System.out.println("activeCount " + Thread.activeCount());
        }
    }

    @Test
    public void getLcm() {
        List<Integer> inputDataArray1 = new ArrayList(Arrays.asList(2, 4));
        List<Integer> inputDataArray2 = new ArrayList(Arrays.asList(16, 32, 96));
        assertEquals(4, new completeSet.CountFinder(inputDataArray1, inputDataArray2).getLcm());
    }

    @Test
    public void getLcm2() {
        List<Integer> inputDataArray1 = new ArrayList(Arrays.asList(3, 6));
        List<Integer> inputDataArray2 = new ArrayList(Arrays.asList(16, 32, 96));
        assertEquals(6, new completeSet.CountFinder(inputDataArray1, inputDataArray2).getLcm());
    }

    @Test
    public void getLcm3() {
        List<Integer> inputDataArray1 = new ArrayList(Arrays.asList(3, 6, 9));
        List<Integer> inputDataArray2 = new ArrayList(Arrays.asList(16, 32, 96));
        assertEquals(18, new completeSet.CountFinder(inputDataArray1, inputDataArray2).getLcm());
    }


    @Test
    public void getMultiples() {
    }

    @Test
    public void getCount() {
        List<Integer> inputDataArray1 = new ArrayList(Arrays.asList(2, 4));
        List<Integer> inputDataArray2 = new ArrayList(Arrays.asList(16, 32, 96));
        int[] multiples = {0, 4, 8};
        assertEquals(2, new completeSet.CountFinder(inputDataArray1, inputDataArray2).getCount(multiples));
    }

    @Test
    public void getCount2() {
        List<Integer> inputDataArray1 = new ArrayList(Arrays.asList(2, 4));
        List<Integer> inputDataArray2 = new ArrayList(Arrays.asList(16, 32, 96));
        int[] multiples = {0, 4, 8, 12};
        assertEquals(2, new completeSet.CountFinder(inputDataArray1, inputDataArray2).getCount(multiples));
    }

    @Test
    public void getCount3() {
        List<Integer> inputDataArray1 = new ArrayList(Arrays.asList(2, 4));
        List<Integer> inputDataArray2 = new ArrayList(Arrays.asList(16, 32, 96));
        int[] multiples = {0};
        assertEquals(0, new completeSet.CountFinder(inputDataArray1, inputDataArray2).getCount(multiples));
    }

    @Test
    public void getCount4() {
        List<Integer> inputDataArray1 = new ArrayList(Arrays.asList(2, 4));
        List<Integer> inputDataArray2 = new ArrayList(Arrays.asList(16, 32, 96));
        int[] multiples = {0, 4};
        assertEquals(1, new completeSet.CountFinder(inputDataArray1, inputDataArray2).getCount(multiples));
    }
}