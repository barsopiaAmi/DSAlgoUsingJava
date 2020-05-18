package me.barsopia.ami.algo;

import me.barsopia.ami.dataStructure.interfaces.StackImplOptimized;

// https://www.hackerrank.com/challenges/equal-stacks/problem
public class StackAlgo3 {

    StackImplOptimized s1;
    StackImplOptimized s2;
    StackImplOptimized s3;

    public int getMaxCommonLevel(int[] stack1, int[] stack2, int[] stack3) {

        s1 = new StackImplOptimized(stack1);
        s2 = new StackImplOptimized(stack2);
        s3 = new StackImplOptimized(stack3);

        int sumS1 = 0, sumS2 = 0, sumS3 = 0;
        for (int i = 0; i < stack1.length; i++) {
            sumS1 += stack1[i];
        }
        for (int i = 0; i < stack2.length; i++) {
            sumS2 += stack2[i];
        }
        for (int i = 0; i < stack3.length; i++) {
            sumS3 += stack3[i];
        }
        return checkMaximum(sumS1, sumS2, sumS3);
    }

    private int checkMaximum(int sumS1, int sumS2, int sumS3) {
        while (s1.getSizeOfStack() != 0 && s2.getSizeOfStack() != 0 && s3.getSizeOfStack() != 0) {
//            System.out.println(sumS1 + " " + sumS2 + " " + sumS3);
            if (sumS1 == sumS2 && sumS1 == sumS3) {
                return sumS1;
            } else if (sumS1 >= sumS2 && sumS1 >= sumS3) {
                sumS1 -= s1.pop();
            } else if (sumS2 >= sumS3 && sumS2 >= sumS1) {
                sumS2 -= s2.pop();
            } else if (sumS3 >= sumS1 && sumS3 >= sumS2) {
                sumS3 -= s3.pop();
            }
        }
        return 0;
    }
}
