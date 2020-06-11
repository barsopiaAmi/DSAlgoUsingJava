package me.barsopia.ami.algo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static me.barsopia.ami.helper.TestHelper.assertListEquals;

public class compareTheTriplatesTest {

    @Test
    public void TestCase1() {
        compareTheTriplates compareTheTriplates = new compareTheTriplates();
        List<Integer> dataSet1 = new ArrayList(Arrays.asList(5, 6, 7));
        List<Integer> dataSet2 = new ArrayList(Arrays.asList(3, 6, 10));
        List<Integer> outputSet = new ArrayList(Arrays.asList(1, 1));

        List<Integer> expectedOutputSet = compareTheTriplates.compareTriplates(dataSet1, dataSet2);
        assertListEquals(outputSet, expectedOutputSet);

    }

    @Test
    public void TestCase2() {
        compareTheTriplates compareTheTriplates = new compareTheTriplates();
        List<Integer> dataSet1 = new ArrayList(Arrays.asList(17, 28, 30));
        List<Integer> dataSet2 = new ArrayList(Arrays.asList(99, 16, 8));
        List<Integer> outputSet = new ArrayList(Arrays.asList(2, 1));

        List<Integer> expectedOutputSet = compareTheTriplates.compareTriplates(dataSet1, dataSet2);
        assertListEquals(outputSet, expectedOutputSet);

    }

}