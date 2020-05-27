package me.barsopia.ami.dataStructure.interfaces;

import java.util.Arrays;

public class StackImplOptimized {
    public int[] values;
    int top;

    public StackImplOptimized(int[] stack1) {
        values = stack1;
    }

    public void push(int value) {
        throw new UnsupportedOperationException();
    }

    public int pop() {
        if (top == values.length) {
            throw new IllegalStateException();
        }
        int topValue = values[top];
        top++;
        return topValue;
    }

    public int[] getAllElements() {
        return Arrays.copyOfRange(values, top, values.length);
    }

    public int[] getInternalArray() {
        return values;
    }

    public int getSizeOfStack() {
        return values.length - top;
    }
}
