package me.barsopia.ami.dataStructure.implementations;

import me.barsopia.ami.dataStructure.interfaces.Queue;

import java.util.Arrays;
import java.util.List;

public class QueueImpl implements Queue {
    int[] dataSet;
    int front = 0, rear = 0;

    public QueueImpl() {
        front = 0;
        rear = 0;
        dataSet = new int[40];
    }

    public QueueImpl(int capacity) {
        front = 0;
        rear = 0;
        dataSet = new int[capacity];
    }

    @Override
    public void add(int x) {
        if (rear != dataSet.length) {
            dataSet[rear++] = x;
        }
    }

    @Override
    public int remove() {
        if (front == rear) {
            throw new IllegalStateException();
        }
        return dataSet[front++];
    }

    @Override
    public List<int[]> getAll() {
        return Arrays.asList(dataSet);
    }

    @Override
    public int peek() {
        return dataSet[front];
    }
}
