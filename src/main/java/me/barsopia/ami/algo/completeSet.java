package me.barsopia.ami.algo;

import java.util.List;

public class completeSet {
    public int getCompleteSet(List<Integer> inputDataArray1, List<Integer> inputDataArray2) {
        return new CountFinder(inputDataArray1, inputDataArray2).count();
    }

    static class CountFinder {
        private final List<Integer> inputDataArray1;
        private final List<Integer> inputDataArray2;

        public CountFinder(List<Integer> inputDataArray1, List<Integer> inputDataArray2) {
            this.inputDataArray1 = inputDataArray1;
            this.inputDataArray2 = inputDataArray2;
        }

        public int count() {
            int lcm = getLcm();
            int[] multiple = getMultiples(lcm);
            int count = getCount(multiple);
            return count;
        }

        public int[] getMultiples(int lcm) {
            int max = findMax(inputDataArray2);
            int t = max / lcm;
            int[] multiple = new int[t + 1];
            for (int i = 1; i <= t; i++) {
                multiple[i] = i * lcm;
            }
            return multiple;
        }

        int gcd(int a, int b) {
            if (a == 0)
                return b;
            return gcd(b % a, a);
        }

        int lcm(int a, int b) {
            return (a * b) / gcd(a, b);
        }

        public int getLcm() {
            int lcm = lcm(inputDataArray1.get(0), inputDataArray1.get(1));
            for (int i = 2; i < inputDataArray1.size(); i++) {
                lcm = lcm(lcm, inputDataArray1.get(i));
            }
            return lcm;
        }

        public int getCount(int[] multiple) {
            int count = 0;
            for (int i = 1; i < multiple.length; i++) {
                int k;
                for (k = 0; k < inputDataArray2.size(); k++) {
                    if (inputDataArray2.get(k) % multiple[i] != 0) {
                        break;
                    }
                }
                if (k == inputDataArray2.size()) {
                    count++;
                }
            }
            return count;
        }

        private int findMax(List<Integer> inputDataArray2) {
            int max = inputDataArray2.get(0);
            for (int i = 0; i < inputDataArray2.size(); i++) {
                if (inputDataArray2.get(i) > max) {
                    max = inputDataArray2.get(i);
                }
            }
            return max;
        }
    }
}
