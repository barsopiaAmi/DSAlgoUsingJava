package me.barsopia.ami.algo;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class StackAlgo3Test {

    public static int[] reverse(int[] stack) {
        for (int i = 0; i < stack.length / 2; i++) {
            Object temp = stack[i];
            stack[i] = stack[stack.length - 1 - i];
            stack[stack.length - 1 - i] = (int) temp;
        }
        return stack;
    }

    /*
     * Complete the equalStacks function below.
     */
    static int equalStacks(int[] h1, int[] h2, int[] h3) {
        StackAlgo3 s = new StackAlgo3();
//        h1=reverse(h1);
//        h2=reverse(h2);
//        h3=reverse(h3);
        return s.getMaxCommonLevel(h1, h2, h3);
    }

    public static void main(String[] args) throws IOException {
        final Scanner scanner = new Scanner(new File("D:\\Ami\\DSAlgoUsingJava\\src\\main\\resources\\ALGO3\\input04.txt"));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] n1N2N3 = scanner.nextLine().split(" ");

        int n1 = Integer.parseInt(n1N2N3[0].trim());

        int n2 = Integer.parseInt(n1N2N3[1].trim());

        int n3 = Integer.parseInt(n1N2N3[2].trim());

        int[] h1 = new int[n1];

        String[] h1Items = scanner.nextLine().split(" ");

        for (int h1Itr = 0; h1Itr < n1; h1Itr++) {
            int h1Item = Integer.parseInt(h1Items[h1Itr].trim());
            h1[h1Itr] = h1Item;
        }

        int[] h2 = new int[n2];

        String[] h2Items = scanner.nextLine().split(" ");

        for (int h2Itr = 0; h2Itr < n2; h2Itr++) {
            int h2Item = Integer.parseInt(h2Items[h2Itr].trim());
            h2[h2Itr] = h2Item;
        }

        int[] h3 = new int[n3];

        String[] h3Items = scanner.nextLine().split(" ");

        for (int h3Itr = 0; h3Itr < n3; h3Itr++) {
            int h3Item = Integer.parseInt(h3Items[h3Itr].trim());
            h3[h3Itr] = h3Item;
        }

        long start = System.currentTimeMillis();
        int result = equalStacks(h1, h2, h3);
        System.out.println("Time" + (System.currentTimeMillis() - start));
        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
    }

    @Test
    public void testCase1() {
        StackAlgo3 s = new StackAlgo3();
        int[] stack1 = {3, 2, 1, 1, 1};
        int[] stack2 = {4, 3, 2};
        int[] stack3 = {1, 1, 4, 1};
        reverse(stack1);
        reverse(stack2);
        reverse(stack3);
        int maxLevel = s.getMaxCommonLevel(stack1, stack2, stack3);
        Assert.assertEquals(7, maxLevel);
    }
}