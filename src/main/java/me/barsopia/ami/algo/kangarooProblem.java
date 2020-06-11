package me.barsopia.ami.algo;

public class kangarooProblem {
    public String kangarooMeets(int x1, int v1, int x2, int v2) {
        double t = (x2 - x1) / (double) (v1 - v2);
        if (t >= 0 && t / (int) t == 1) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
