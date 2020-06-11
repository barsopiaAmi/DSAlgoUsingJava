package me.barsopia.ami.algo;

import java.util.List;

public class diagonalDifference {
    public int findDifference(List<List<Integer>> dataSet) {
        int daigonalL = 0, daigonalR = 0;
        int j = dataSet.size() - 1;
        for (int i = 0; i < dataSet.size(); i++) {
            daigonalL = daigonalL + dataSet.get(i).get(i);
            daigonalR = daigonalR + dataSet.get(i).get(j);
            j--;
        }

        return Math.abs(daigonalL - daigonalR);
    }
}


//diagonalSum = array[0][0]+array[1][1]+ .... + array[n-1][n-1];
//revDiagonalSum = array[0][2]+array[1][1]+ .... + array[2][0];

