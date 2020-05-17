package me.barsopia.ami.dataStructure.interfaces;

import me.barsopia.ami.dataStructure.implementations.HashMap;
import me.barsopia.ami.model.Student;
import org.junit.Assert;
import org.junit.Test;

public class MapInterfaceTest {
    @Test
    public void testSinglePut() {
        MapInterface map = getMapImplementation();
        Student object = new Student("Pinkesh");
        map.put(10, object);
    }

    private MapInterface getMapImplementation() {
        //MapInterface mp=new InternalMapInterface 0
        return new HashMap();
    }

    @Test
    public void testSinglePutSingleGet() {
        MapInterface map = getMapImplementation();
        Student object = new Student("Pinkesh");
        map.put(10, object);
        Student objectRe = (Student) map.get(10);
        Assert.assertEquals(object.name, objectRe.name);
    }


    @Test
    public void testSinglePutSingleGet2() {
        MapInterface map = getMapImplementation();
        Student object = new Student("Ami");
        map.put(10, object);
        Student objectRe = (Student) map.get(10);
        Assert.assertEquals(object.name, objectRe.name);
    }

    public void testSinglePutSingleGetTwice() {
        MapInterface map = getMapImplementation();
        Student Ami = new Student("Ami");
        map.put(10, Ami);
        Student AmiRe = (Student) map.get(10);
        Assert.assertEquals(Ami.name, AmiRe.name);
        Student Pinkesh = new Student("Pinkesh");
        map.put(11, Pinkesh);
        Student PinkeshRe = (Student) map.get(11);
        Assert.assertEquals(Pinkesh.name, PinkeshRe.name);
    }

    @Test
    public void testSinglePutSingleGetTwiceInter() {
        MapInterface map = getMapImplementation();
        Student Ami = new Student("Ami");
        map.put(10, Ami);
        Student Pinkesh = new Student("Pinkesh");
        map.put(11, Pinkesh);
        Student AmiRe = (Student) map.get(10);
        Assert.assertEquals(Ami.name, AmiRe.name);
        Student PinkeshRe = (Student) map.get(11);
        Assert.assertEquals(Pinkesh.name, PinkeshRe.name);
    }

    @Test
    public void testSinglePutSingleGetLargeId() {
        MapInterface map = getMapImplementation();
        Student Ami = new Student("Ami");
        map.put(10, Ami);
        Student Pinkesh = new Student("Pinkesh");
        map.put(11, Pinkesh);
        Student AmiRe = (Student) map.get(10);
        Assert.assertEquals(Ami.name, AmiRe.name);
        Student PinkeshRe = (Student) map.get(11);
        Assert.assertEquals(Pinkesh.name, PinkeshRe.name);
    }

    @Test
    public void testSinglePutSingleGetRandonId() {
        MapInterface map = getMapImplementation();
        Student Ami = new Student("Ami");
        int random = (int) (Math.random() * Integer.MAX_VALUE);
        System.out.println(random);
        map.put(random, Ami);
        Student AmiRe = (Student) map.get(random);
        Assert.assertEquals(Ami.name, AmiRe.name);
    }

    @Test
    public void testSinglePutSingleGetLargeId2() {
        MapInterface map = getMapImplementation();
        Student Ami = new Student("Ami");
        int largeKey = Integer.MAX_VALUE / 2;
        map.put(largeKey, Ami);
        Student AmiRe = (Student) map.get(largeKey);
        Assert.assertEquals(Ami.name, AmiRe.name);
    }

    @Test
    public void testSingleInsertAndDelete() {
        //given
        MapInterface map = getMapImplementation();
        Student Ami = new Student("Ami");
        int largeKey = 10000;

        map.put(largeKey, Ami);
        Student AmiRe = (Student) map.get(largeKey);
        Assert.assertEquals(Ami.name, AmiRe.name);
        //when
        map.delete(largeKey);
        Student AmiAfterDelete = (Student) map.get(largeKey);
//then
        Assert.assertNull(AmiAfterDelete);
    }

    @Test
    public void testDoubleInsertAndSingleDelete() {
//given
        MapInterface map = getMapImplementation();
        Student Ami = new Student("Ami");
        map.put(10, Ami);
        Student Pinkesh = new Student("Pinkesh");
        map.put(11, Pinkesh);
        Student AmiRe = (Student) map.get(10);
        Assert.assertEquals(Ami.name, AmiRe.name);
        Student PinkeshRe = (Student) map.get(11);
        Assert.assertEquals(Pinkesh.name, PinkeshRe.name);
        map.delete(10);
        Student AmiAfterDelete = (Student) map.get(10);
        Assert.assertNull(AmiAfterDelete);
        // when
        Student PinkeshAfterAmiDeleted = (Student) map.get(11);
        //then
        Assert.assertEquals(Pinkesh.name, PinkeshAfterAmiDeleted.name);
    }

    @Test
    public void testThreeInsert() {
        MapInterface map = getMapImplementation();
        Student Ami = new Student("Ami");
        map.put(10, Ami);
        Student Pinkesh = new Student("Pinkesh");
        map.put(11, Pinkesh);
        Student Vivek = new Student("Vivek");
        map.put(12, Vivek);
        Student VivekRe = (Student) map.get(12);
        Assert.assertEquals(Vivek.name, VivekRe.name);
        Student PinkeshRe = (Student) map.get(11);
        Assert.assertEquals(Pinkesh.name, PinkeshRe.name);
    }

    @Test
    public void testMultipleInsertDelete() {
        MapInterface map = getMapImplementation();
        Student Ami = new Student("Ami");
        map.put(10, Ami);
        Student Pinkesh = new Student("Pinkesh");
        map.put(11, Pinkesh);
        map.delete(10);
        map.delete(11);
        Student PinkeshAfterDelete = (Student) map.get(11);
        Assert.assertNull(PinkeshAfterDelete);
        Student VivekAfterDelete = (Student) map.get(12);
        Assert.assertNull(VivekAfterDelete);
    }
}