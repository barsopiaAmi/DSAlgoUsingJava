package me.barsopia.ami.algo;

import me.barsopia.ami.dataStructure.interfaces.StackImplOptimized;

public class StackAlgo4 {
    StackImplOptimized s1;
    StackImplOptimized s2;
    int[] cumSumStack1;
    int[] cumSumStack2;

    public int getMaxNumberOfPops(int[] stack1, int[] stack2, int maxSum) {
        s1 = new StackImplOptimized(stack1);
        s2 = new StackImplOptimized(stack2);
        int maxPopNo = 0;
        int sumOfStack;

        cumSumStack1 = calcCumSum(stack1);
        cumSumStack2 = calcCumSum(stack2);

        for (int noOfPop1 = 0; noOfPop1 <= stack1.length; noOfPop1++) {
            for (int noOfPop2 = 0; noOfPop2 <= stack2.length; noOfPop2++) {
                sumOfStack = getSumStack1(noOfPop1) + getSumStack2(noOfPop2);
                if (sumOfStack <= maxSum) {
                    if (maxPopNo <= noOfPop1 + noOfPop2) {
                        maxPopNo = noOfPop1 + noOfPop2;
                    }
                } else {
                    break;
                }
            }
        }

        return maxPopNo;
    }


    public int[] calcCumSum(int[] array) {
        int[] x = new int[array.length];
        x[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            x[i] = x[i - 1] + array[i];
        }
        return x;
    }

    int getSum(int[] stack1, int noOfPopFromStack1) {
        int sum = 0;
        for (int i = 0; i < noOfPopFromStack1; i++) {
            sum += stack1[i];
        }
        return sum;
    }


    int getSumStack1(int noOfPopFromStack1) {
        if (noOfPopFromStack1 == 0) {
            return 0;
        }

        return cumSumStack1[noOfPopFromStack1 - 1];
    }

    int getSumStack2(int noOfPopFromStack2) {
        if (noOfPopFromStack2 == 0) {
            return 0;
        }

        return cumSumStack2[noOfPopFromStack2 - 1];
    }
}


