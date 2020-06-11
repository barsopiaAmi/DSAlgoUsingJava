package me.barsopia.ami.algo;

public class CountFruitsInHouse {
    public int[] countFruits(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int appleCount = 0, orangeCount = 0;
        for (int i = 0; i < apples.length; i++) {
            apples[i] = a + apples[i];
            if (apples[i] >= s && apples[i] <= t) {
                appleCount++;
            }
        }
        for (int i = 0; i < oranges.length; i++) {
            oranges[i] = a + oranges[i];
            if (oranges[i] >= s && oranges[i] <= t) {
                orangeCount++;
            }
        }
        System.out.println(appleCount);
        System.out.println(orangeCount);

        return new int[]{appleCount, orangeCount};
    }
}
