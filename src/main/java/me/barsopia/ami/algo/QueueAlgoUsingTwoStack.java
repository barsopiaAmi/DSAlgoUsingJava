package me.barsopia.ami.algo;

import me.barsopia.ami.dataStructure.implementations.StackImpl;
import me.barsopia.ami.dataStructure.interfaces.DSPerfAPI;
import me.barsopia.ami.dataStructure.interfaces.Queue;
import me.barsopia.ami.dataStructure.interfaces.Stack;

import java.util.List;

public class QueueAlgoUsingTwoStack implements Queue, DSPerfAPI {
    Stack<Integer> stack1 = new StackImpl<Integer>();
    Stack<Integer> stack2 = new StackImpl<Integer>();
    Integer peekElement = null;
    int stepCount = 0;

    private StackImpl<Integer> getImpl() {
        return new StackImpl<>(500);
    }

    @Override
    public void add(int x) {
        stepCount = 0;
        stepCount++;
        stepCount++;
        if (peekElement == null) {
            stepCount++;
            peekElement = x;
        }
        stack1.push(x);
    }

    @Override
    public int remove() {
        int popElement = 0;
        stepCount++;
        int sizeOfStack = stack1.getSizeOfStack();
        stepCount++;
        stepCount++;//condition check
        if (sizeOfStack == 0) {
            stepCount++;
            throw new IllegalStateException();
        }
        stepCount++;//for i=0
        for (int i = 0; i < sizeOfStack; i++) {
            stepCount++;
            int t = stack1.pop();
            stepCount++;
            stack2.push(t);
            stepCount += 2; //for condition and i++
        }
        stepCount++;
        popElement = stack2.pop();
        stepCount++;
        peekElement = stack2.peek();
        stepCount++;
        sizeOfStack = stack2.getSizeOfStack();
        stepCount++;
        for (int i = 0; i < sizeOfStack; i++) {
            stepCount++;
            int t = stack2.pop();
            stepCount++;
            stack1.push(t);
            stepCount += 2;
        }
        stepCount++;
        return popElement;
    }

    @Override
    public List<int[]> getAll() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int peek() {
        return peekElement;
    }


    @Override
    public int getGetLastActionSteps() {
        return stepCount;
    }
}
