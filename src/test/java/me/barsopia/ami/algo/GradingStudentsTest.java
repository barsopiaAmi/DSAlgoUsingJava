package me.barsopia.ami.algo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static me.barsopia.ami.helper.TestHelper.assertListEquals;

public class GradingStudentsTest {

    @Test
    public void TestCase1() {
        GradingStudents gradingStudents = new GradingStudents();
        List<Integer> inputData = new ArrayList(Arrays.asList(73, 67, 38, 33));
        List<Integer> outputData = new ArrayList(Arrays.asList(75, 67, 40, 33));

        assertListEquals(outputData, gradingStudents.getGradsOfStudents(inputData));
    }

    @Test
    public void TestCase2() {
        GradingStudents gradingStudents = new GradingStudents();
        List<Integer> inputData = new ArrayList(Arrays.asList(80, 96, 18, 73, 78, 60, 60, 15, 45, 15, 10, 5, 46, 87, 33, 60, 14, 71, 65, 2, 5, 97, 0));
        List<Integer> outputData = new ArrayList(Arrays.asList(80, 96, 18, 75, 80, 60, 60, 15, 45, 15, 10, 5, 46, 87, 33, 60, 14, 71, 65, 2, 5, 97, 0));
        List<Integer> gradsOfStudents = gradingStudents.getGradsOfStudents(inputData);
        assertListEquals(outputData, gradsOfStudents);
    }
}