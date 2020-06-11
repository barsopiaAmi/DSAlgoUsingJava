package me.barsopia.ami.dataStructure.interfaces;

import java.util.List;

public interface Queue {

    void add(int x);

    int remove();

    List<int[]> getAll();

    int peek();
}
