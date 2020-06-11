package me.barsopia.ami.algo;

public class aVeryBigSum {
    public long aVeryBigSum(long[] dataSet) {
        long sum = 0;
        for (int i = 0; i < dataSet.length; i++) {
            sum = sum + dataSet[i];
        }
        return sum;
    }
}
