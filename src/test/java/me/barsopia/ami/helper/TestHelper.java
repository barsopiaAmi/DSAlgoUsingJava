package me.barsopia.ami.helper;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestHelper {

    public static void assertListEquals(List<Integer> expected, List<Integer> actual) {
        assertEquals("different array size", expected.size(), actual.size());
        for (int i = 0; i < actual.size(); i++) {
            assertEquals("different at index:" + i, expected.get(i), actual.get(i));
        }
    }
}
