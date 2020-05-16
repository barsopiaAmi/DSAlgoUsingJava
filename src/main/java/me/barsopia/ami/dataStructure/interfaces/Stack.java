package me.barsopia.ami.dataStructure.interfaces;

import java.util.List;

public interface Stack {
    void push(int value);
    int pop();
    List<Integer> getAllElement();
    int getSizeOfStack();
}
