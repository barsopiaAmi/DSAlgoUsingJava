package me.barsopia.ami.java;

import me.barsopia.ami.algo.QueueAlgoUsingTwoStack;
import me.barsopia.ami.model.Books;
import me.barsopia.ami.model.Student;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class JavaFeaturesTest {

    public static void main(String[] args) {
        new JavaFeaturesTest().testMaxBigArray();
    }

    @Test //IS-A relationship
    public void testInstanceOf() {
        Object s = new Student("Ami");
        assertTrue(s instanceof Student);
        assertFalse(s instanceof QueueAlgoUsingTwoStack);
        assertTrue(s instanceof Object);
    }

    @Test
    public void testHas_A_Relation() {
        Student s = new Student("Ami");
        Books givenBook = new Books("OOPS");//pass book name to constructor and assign it
        String str = "OOPS";
        s.takeBook(givenBook);
        assertEquals(str, s.getBook().getName());
    }

    @Test
    public void testHas_A_Relation_2() {
        //given
        Student s = new Student("Ami");
        Books givenBook = new Books("Oops");//pass book name to constructor and assign it
        s.takeBook(givenBook); //assign book name;
        //when
        Books returnedBook = s.getBook();

        //then
        assertEquals(givenBook.getName(), returnedBook.getName());
    }

    @Test
    public void testStream() {
        List<Integer> list = Arrays.asList(2, 5, 6, 1, 92, 7, 9, 5, 6, 5);
//        Comparator<Integer> compareTo = (i1,i2) -> {if(i1==i2){return 0;}else if(i1<i2){return -1;}else return +1;};

//        System.out.println(compareTo.compare(55,3));
//        Integer max = list.stream().min(compareTo).get();
//        System.out.println(max);
//        list.forEach(System.out::println);
//        Stream<Integer> integerStream = list.stream().map(i -> i % 5);
//        List<Integer> collect = integerStream.collect(Collectors.toList());
//        integerStream = list.stream().map(i -> i % 5);
//        integerStream.forEach(System.out::println);
    }

    @Test
    public void testArray() {
    }

    @Test
    public void testMaxBigArray() {
        List<Integer> randomIntArrayList = getRandomIntArrayList(10000000);
        double totalTime = 0;
        findMax(randomIntArrayList);
        int iteration = 5;
        for (int i = 0; i < iteration; i++)
            totalTime += findMax(randomIntArrayList);
        System.out.println(totalTime / iteration);
    }

    private double findMax(List<Integer> list) {
        long startTime = System.nanoTime();
        getMaxInternal(list);
        double time = (System.nanoTime() - startTime) / (double) 1000000;
        return time;
    }

    private void getMaxInternal(List<Integer> list) {
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
    }

    private void getMaxInternal2(List<Integer> list) {
        int parallelThreads = 5;
        List<Integer> maxList = new ArrayList<>(parallelThreads);

        int max = list.get(0);

        for (int i = 1; i < list.size() / 5; i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
    }

    private List<Integer> getRandomIntArrayList(int size) {
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add((int) (Math.random() * Integer.MAX_VALUE));
        }
        return list;
    }
}