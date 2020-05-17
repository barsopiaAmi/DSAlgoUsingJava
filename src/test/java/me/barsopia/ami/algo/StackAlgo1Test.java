package me.barsopia.ami.algo;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

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

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("D:\\Ami\\DSAlgoUsingJava\\src\\main\\resources\\input03.txt"));
        //test your code
        long timeMillis = System.currentTimeMillis();
        int n=scanner.nextInt();
        StackAlgo1 s = new StackAlgo1();
        for (int i = 0; i < n; i++) {
            switch (scanner.nextInt()) {
                case 1:
                    s.push(scanner.nextInt());
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    int max = s.FindMaximumFromStack();
                    System.out.println(max);
                    break;
            }
        }

        scanner.close();
        System.out.println(System.currentTimeMillis() - timeMillis);
    }
}