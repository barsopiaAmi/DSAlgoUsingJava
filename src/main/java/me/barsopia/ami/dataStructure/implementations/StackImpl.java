package me.barsopia.ami.dataStructure.implementations;

import me.barsopia.ami.dataStructure.interfaces.Stack;

import java.util.Arrays;
import java.util.List;

public class StackImpl implements Stack {
    int top;
    Integer[] values;

    public StackImpl(int capacity) {
        top = 0;
        values = new Integer[capacity];
    }

    public StackImpl() {
        top = 0;
        values = new Integer[10];
    }

    public void push(int value) {
        if (top == values.length) {
            this.values = Arrays.copyOf(values, values.length * 2);
        }
        values[top] = value;
        top++;
    }

    public int pop() {
        top--;
        int topValue = values[top];
        values[top] = null;
        return topValue;
    }

    public List<Integer> getAllElement() {
        return Arrays.asList(values);
    }

    public int getSizeOfStack() {
        return top;
    }
}
