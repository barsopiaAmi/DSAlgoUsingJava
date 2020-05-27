package me.barsopia.ami.algo;

public class ArrayAlgo1 {

    public int getMaxElement(int[] array) {
        int max = 0;
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public int getMinElement(int[] array) {
        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}
