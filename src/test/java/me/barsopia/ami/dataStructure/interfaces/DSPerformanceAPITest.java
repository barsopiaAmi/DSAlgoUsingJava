package me.barsopia.ami.dataStructure.interfaces;

import me.barsopia.ami.algo.PrintPattern;
import me.barsopia.ami.dataStructure.implementations.HashMap;
import me.barsopia.ami.model.Student;
import org.junit.Assert;
import org.junit.Test;

public class DSPerformanceAPITest {

    @Test
    public void getTestPutPerformance_O1() {
        DSPerformanceAPI map = getMapImplementation();
        Student Ami = new Student("Ami");
        map.put(10, Ami);
        int stepsOfPutMethod1 = map.getGetLastActionSteps();
        Student Pinkesh = new Student("Pinkesh");
        map.put(11, Pinkesh);
        int stepsOfPutMethod2 = map.getGetLastActionSteps();
        Student Vivek = new Student("Vivek");
        map.put(12, Vivek);
        int stepsOfPutMethod3 = map.getGetLastActionSteps();
        Assert.assertEquals(stepsOfPutMethod1, stepsOfPutMethod2);
        Assert.assertEquals(stepsOfPutMethod2, stepsOfPutMethod3);
    }

    @Test
    public void getTestGetPerformance_O1() {
        DSPerformanceAPI map = this.getMapImplementation();
        Student Ami = new Student("Ami");
        map.put(10, Ami);
        Student Pinkesh = new Student("Pinkesh");
        map.put(11, Pinkesh);
        Student Vivek = new Student("Vivek");
        map.put(12, Vivek);
        Student AmiRe = (Student) map.get(10);
        int stepsOfPutMethod1 = map.getGetLastActionSteps();
        Student VivekRe = (Student) map.get(12);
        int stepsOfPutMethod2 = map.getGetLastActionSteps();
        Student PinkeshRe = (Student) map.get(11);
        int stepsOfPutMethod3 = map.getGetLastActionSteps();
        Assert.assertEquals(stepsOfPutMethod1, stepsOfPutMethod2);
        Assert.assertEquals(stepsOfPutMethod2, stepsOfPutMethod3);

    }

    @Test
    public void getTestDeletePerformance_01() {
        DSPerformanceAPI map = getMapImplementation();
        Student Ami = new Student("Ami");
        map.put(10, Ami);
        map.delete(10);
        int peroformance_01 = map.getGetLastActionSteps();
        Student Pinkesh = new Student("Pinkesh");
        map.put(11, Pinkesh);
        map.delete(11);
        System.out.println(peroformance_01);
        int peroformance_02 = map.getGetLastActionSteps();
        Assert.assertEquals(peroformance_01, peroformance_02);
    }

    private DSPerformanceAPI getMapImplementation() {
        //MapInterface mp=new InternalMapInterface 0
        return new HashMap();
    }

    @Test
    public void printP(){
        PrintPattern p=new PrintPattern();
        p.printPattern(7);
    }

}