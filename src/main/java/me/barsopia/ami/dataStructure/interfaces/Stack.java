package me.barsopia.ami.dataStructure.interfaces;

import java.util.List;

public interface Stack<T> {
    void push(T value);
    T pop();
    List<T> getAllElement();
    int getSizeOfStack();
}
