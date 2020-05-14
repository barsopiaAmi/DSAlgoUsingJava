package me.barsopia.ami.dataStructure.implementations;

import me.barsopia.ami.dataStructure.interfaces.DSPerformanceAPI;
import me.barsopia.ami.dataStructure.interfaces.MapInterface;

class Entry {
    int key;
    Object object = new Object();
}

public class HashMap implements MapInterface, DSPerformanceAPI {
    Entry[] dataset = new Entry[1000];
    int countSteps = 0;

    public void put(int key, Object object) {
        countSteps = 0;
        countSteps++;
        int index = getHash(key);
        countSteps++;
        while (dataset[index] != null) {
            countSteps++;
            countSteps++;
            index++;
        }
        countSteps += 3;
        dataset[index] = new Entry();
        dataset[index].key = key;
        dataset[index].object = object;
    }

//    private int getHash(double key) {
//        countSteps+=5;
//        return (int) (key / (double) Integer.MAX_VALUE) * 1000;
//    }

    private int getHash(int key) {
        countSteps += 2;
        return ( key % dataset.length);
    }

    public Object get(int key) {
        countSteps = 0;
        countSteps += 2;
        for (int i = getHash(key); i < dataset.length; i++) {
            countSteps += 2;
            if (dataset[i] != null && dataset[i].key == key) {
                countSteps++;
                return dataset[i].object;
            }
            countSteps += 2;
        }
        countSteps++;
        return null;
    }

    public void delete(int key) {
        countSteps = 0;
        countSteps += 2;
        for (int i = getHash(key); i < dataset.length; i++) {
            countSteps += 2;
            if (dataset[i] != null && dataset[i].key == key) {
                countSteps++;
                dataset[i] = null;
                return;
            }
            countSteps += 2;
        }
    }


    public int getGetLastActionSteps() {
        return countSteps;
    }
}
