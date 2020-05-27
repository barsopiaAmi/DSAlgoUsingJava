package me.barsopia.ami.algo;

public class ArrayAlgo2 {
    //stack1 = {4, 2, 4, 6, 1};
    public int getMaxSumPair(int[] array) {
        int max1 = 0, max2;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] > max1) {
                    max1 = array[i] + array[j];
                }
            }
        }
        return max1;
    }

    public int getMaxSumPair(int[] array1, int[] array2) {
        int maxFromArray1 = array1[0];
        int maxFromArray2 = array2[0];
        for (int value : array1) {
            if (value > maxFromArray1) {
                maxFromArray1 = value;
            }
        }
        for (int value : array2) {
            if (value > maxFromArray2) {
                maxFromArray2 = value;
            }
        }
        return maxFromArray1 + maxFromArray2;
    }

    public int getMaxSumPairDiffConst(int[] array) {
        int maxSum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                System.out.println("i=" + i + " " + "j=" + j);
                if (array[i] - array[j] >= 3 || array[j] - array[i] >= 3) {
                    int sum = array[i] + array[j];
                    if (sum > maxSum) {
                        maxSum = sum;
                    }
                }
            }
        }
        return maxSum;
    }
}
