package me.barsopia.ami.algo;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
    public List<Integer> getGradsOfStudents(List<Integer> originalGrades) {
        List<Integer> roundedGrades = new ArrayList<>(originalGrades.size());
        for (int i = 0; i < originalGrades.size(); i++) {
            Integer roundedGrade = roundGrade(originalGrades, i);
            roundedGrades.add(roundedGrade);
        }
        return roundedGrades;
    }

    private Integer roundGrade(List<Integer> originalGrades, int i) {
        Integer roundedGrade;
        if (originalGrades.get(i) < 38) {
            roundedGrade = originalGrades.get(i);
        } else if (5 - (originalGrades.get(i) % 5) < 3) {
            roundedGrade = originalGrades.get(i) + 5 - (originalGrades.get(i) % 5);
        } else {
            roundedGrade = originalGrades.get(i);
        }
        return roundedGrade;
    }
}
