package me.barsopia.ami.algo;

public class breakingTheRecord {
    public int[] breakingRecords(int[] inputArray) {

        int max = inputArray[0];
        int min = inputArray[0];
        int maxCount = 0, minCount = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] > max) {
                max = inputArray[i];
                maxCount++;
            }
            if (inputArray[i] < min) {
                min = inputArray[i];
                minCount++;
            }
        }
        int[] output = new int[]{maxCount, minCount};
        return output;
    }
}
