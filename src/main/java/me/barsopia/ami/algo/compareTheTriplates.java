package me.barsopia.ami.algo;

import java.util.ArrayList;
import java.util.List;

public class compareTheTriplates {
    public List<Integer> compareTriplates(List<Integer> dataSet1, List<Integer> dataSet2) {

        int aliceCount = 0, bobCount = 0;
        List<Integer> winningScore = new ArrayList<>();
        for (int i = 0; i < dataSet1.size(); i++) {
            if (dataSet1.get(i) > dataSet2.get(i)) {
                aliceCount++;
            } else if (dataSet1.get(i) < dataSet2.get(i)) {
                bobCount++;
            }
        }
        winningScore.add(aliceCount);
        winningScore.add(bobCount);
        return winningScore;
    }
}
