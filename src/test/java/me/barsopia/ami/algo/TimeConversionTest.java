package me.barsopia.ami.algo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TimeConversionTest {

    @Test

    public void testCase1() {
        TimeConversion timeConversion = new TimeConversion();
        String inputTime = "07:05:45PM";
        String outputTime = timeConversion.timeConversion(inputTime);
        assertEquals("19:05:45", outputTime);
    }

    @Test

    public void testCase2() {
        TimeConversion timeConversion = new TimeConversion();
        String inputTime = "12:45:54PM";
        String outputTime = timeConversion.timeConversion(inputTime);
        assertEquals("12:45:54", outputTime);
    }

}