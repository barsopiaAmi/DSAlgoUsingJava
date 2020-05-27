package me.barsopia.ami.algo;

import org.junit.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class StackAlgo4Test {
    static int twoStacks(int x, int[] a, int[] b) {
        StackAlgo4 s1 = new StackAlgo4();
        return s1.getMaxNumberOfPops(a, b, x);
    }

    public static void main(String[] args) throws IOException {
        final Scanner scanner = new Scanner(new File("D:\\Ami\\DSAlgoUsingJava\\src\\main\\resources\\ALGO4\\input08.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\Ami\\DSAlgoUsingJava\\src\\main\\resources\\ALGO4\\am01.txt"));

        int g = Integer.parseInt(scanner.nextLine().trim());

        for (int gItr = 0; gItr < g; gItr++) {
            String[] nmx = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nmx[0].trim());

            int m = Integer.parseInt(nmx[1].trim());

            int x = Integer.parseInt(nmx[2].trim());

            int[] a = new int[n];

            String[] aItems = scanner.nextLine().split(" ");

            for (int aItr = 0; aItr < n; aItr++) {
                int aItem = Integer.parseInt(aItems[aItr].trim());
                a[aItr] = aItem;
            }

            int[] b = new int[m];

            String[] bItems = scanner.nextLine().split(" ");

            for (int bItr = 0; bItr < m; bItr++) {
                int bItem = Integer.parseInt(bItems[bItr].trim());
                b[bItr] = bItem;
            }

            int result = twoStacks(x, a, b);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }

    @Test
    public void testCase1() {
        StackAlgo4 s = new StackAlgo4();
        int[] stack1 = {4, 2, 4, 6, 1};
        int[] stack2 = {2, 1, 8, 5};
        int maxSumLevel = s.getMaxNumberOfPops(stack1, stack2, 10);
        assertEquals(4, maxSumLevel);
    }

    @Test
    public void testCase2() {
        StackAlgo4 s = new StackAlgo4();
        int[] stack1 = {3, 9, 1, 1, 1};
        int[] stack2 = {1, 9, 9, 9};
        int maxSumLevel = s.getMaxNumberOfPops(stack1, stack2, 15);

        assertEquals(5, maxSumLevel);
    }

    @Test
    public void testCase3() {
        StackAlgo4 s = new StackAlgo4();
        int[] stack1 = {16, 1, 17, 2, 15, 15, 18, 19, 11, 19, 19, 14, 10, 15, 3, 12, 18, 9, 15, 14, 9, 3, 6, 10};
        int[] stack2 = {11, 1};
        int maxSumLevel = s.getMaxNumberOfPops(stack1, stack2, 46);

        assertEquals(5, maxSumLevel);
    }

    @Test
    public void testSum() {
        int[] stack1 = {3, 9, 1, 1, 1};
        assertEquals(12, new StackAlgo4().getSum(stack1, 2));
    }

    @Test
    public void testSum1() {
        int[] stack1 = {3, 9, 1, 1, 1};
        assertEquals(0, new StackAlgo4().getSum(stack1, 0));
    }

    @Test
    public void calcCumSum() {
        StackAlgo4 s = new StackAlgo4();
        int[] stack1 = {5, 10, 15, 1,};

        int[] x = {5, 15, 30, 31};
        assertArrayEquals(x, s.calcCumSum(stack1));
    }


}