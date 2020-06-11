package me.barsopia.ami.algo;

public class migratoryBird {
    public int migratoryBirds(int[] input) {
        int cnt = 0, no = input[0], n = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] == input[j]) {
                    cnt++;
                }
            }
        }
        System.out.println(no);
        return cnt;
    }
}
