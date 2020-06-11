package me.barsopia.ami.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TimeConversion {
    public String timeConversion(String inputTime) {
        String outPut = "";
        List<String> time = new ArrayList<>();
        time = Arrays.asList(inputTime.split(":"));
        Integer t;
        if (time.get(2).contains("PM") && Integer.valueOf(time.get(0)) != 12) {
            t = Integer.valueOf(time.get(0)) + 12;
            outPut = t + ":" + time.get(1) + ":" + time.get(2).substring(0, 2);
        } else if (Integer.valueOf(time.get(0)) < 12) {
            outPut = time.get(0) + ":" + time.get(1) + ":" + time.get(2).substring(0, 2);
        } else if (time.get(2).contains("AM")) {
            t = Integer.valueOf(time.get(0)) - 12;
            outPut = t + "0:" + time.get(1) + ":" + time.get(2).substring(0, 2);
        } else if (time.get(2).contains("PM") && Integer.valueOf(time.get(0)) == 12) {
            outPut = time.get(0) + ":" + time.get(1) + ":" + time.get(2).substring(0, 2);
        }

        return outPut;
    }
}
