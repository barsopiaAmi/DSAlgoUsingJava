package me.barsopia.ami.algo;

public class MinMaxSumArrayInt {
    public long[] calculateSumOfArrayElements(int[] inputData) {
        long minSumOfElements = 0, maxSumOfElements = 0, sumOfElements = 0;
        long[] x = new long[2];
        long minElement = inputData[0], maxElement = inputData[0];
        for (int i = 0; i < inputData.length; i++) {
            if (inputData[i] > maxElement) {
                maxElement = inputData[i];
            }
            if (inputData[i] < minElement) {
                minElement = inputData[i];
            }
            sumOfElements = sumOfElements + inputData[i];
        }
        System.out.println(maxElement);
        System.out.println(minElement);
        minSumOfElements = sumOfElements - maxElement;
        maxSumOfElements = sumOfElements - minElement;

        x[0] = minSumOfElements;
        x[1] = maxSumOfElements;

        return x;
    }
}