package me.barsopia.ami.algo;

import me.barsopia.ami.dataStructure.implementations.HashMap;
import me.barsopia.ami.dataStructure.implementations.StackImpl;
import me.barsopia.ami.dataStructure.interfaces.MapInterface;
import me.barsopia.ami.dataStructure.interfaces.Stack;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackAlgo1Test {



    @Test
    public void queryTest()
    {
        StackAlgo1 s=new StackAlgo1();
        s.push(97);
        s.pop();
        s.push(20);
        s.pop();
        s.push(26);
        s.push(20);
        s.pop();
        Assert.assertEquals(26,s.FindMaximumFromStack());
        s.push(91);
        Assert.assertEquals(91,s.FindMaximumFromStack());
        s.push(10);
        Assert.assertEquals(91,s.FindMaximumFromStack());

    }

}