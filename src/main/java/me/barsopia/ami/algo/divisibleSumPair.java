package me.barsopia.ami.algo;

public class divisibleSumPair {
    public int divisibleSumPairs(int n, int k, int[] inputData) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((inputData[i] + inputData[j]) % k == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
