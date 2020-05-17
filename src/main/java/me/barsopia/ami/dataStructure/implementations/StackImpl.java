package me.barsopia.ami.dataStructure.implementations;

import me.barsopia.ami.dataStructure.interfaces.Stack;

import java.util.Arrays;
import java.util.List;

public class StackImpl<T> implements Stack<T> {
    int top;
    Object[] values;

    public StackImpl(int capacity) {
        top = 0;
        values = new Object[capacity];
    }

    public StackImpl() {
        top = 0;
        values = new Object[10];
    }

    public void push(T value) {
        if (top == values.length) {
            this.values = Arrays.copyOf(values, values.length * 2);
        }
        values[top] = value;
        top++;
    }

    public T pop() {
        top--;
        T topValue = (T)values[top];
        values[top] = null;
        return topValue;
    }

    public List<T> getAllElement() {
        return Arrays.asList((T[])values);
    }

    public int getSizeOfStack() {
        return top;
    }
}
