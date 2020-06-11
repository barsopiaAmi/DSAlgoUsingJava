package me.barsopia.ami.dataStructure.implementations;

import me.barsopia.ami.dataStructure.interfaces.DSPerfAPI;
import me.barsopia.ami.dataStructure.interfaces.Stack;

import java.util.Arrays;
import java.util.List;

public class StackImpl<T> implements Stack<T>, DSPerfAPI {
    int top;
    Object[] values;
    int stepCount = 0;

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
        if (top == 0) {
            return null;
        }
        top--;
        T topValue = (T) values[top];
        values[top] = null;
        return topValue;
    }

    public List<T> getAllElement() {
        return Arrays.asList((T[]) values);
    }

    public int getSizeOfStack() {
        return top;
    }

    @Override
    public T peek() {
        return (T) values[top];
    }

    @Override
    public int getGetLastActionSteps() {
        return 0;
    }
}
