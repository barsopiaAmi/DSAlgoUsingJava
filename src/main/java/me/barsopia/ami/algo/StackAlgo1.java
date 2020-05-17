package me.barsopia.ami.algo;

import me.barsopia.ami.dataStructure.implementations.StackImpl;

import java.util.List;

public class StackAlgo1 extends StackImpl<Integer> {
    public int FindMaximumFromStack() {
        List<Integer> allElement = super.getAllElement();
        Integer max = allElement.get(0);
        for (int i = 0; i < super.getSizeOfStack(); i++) {
            if (max < allElement.get(i)) {
                max = allElement.get(i);
            }
        }
        return max;
    }
}
