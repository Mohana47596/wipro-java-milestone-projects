package com.wipro.service;

import com.wipro.bean.Student;

public class StudentService {

    public int findNumberOfNullMarks(Student[] studentData) {
        int total = 0;
        for (Student record : studentData) {
            if (record != null && record.getMarks() == null) {
                total++;
            }
        }
        return total;
    }

    public int findNumberOfNullNames(Student[] studentData) {
        int total = 0;
        for (Student record : studentData) {
            if (record != null && record.getName() == null) {
                total++;
            }
        }
        return total;
    }

    public int findNumberOfNullObjects(Student[] studentData) {
        int total = 0;
        for (Student record : studentData) {
            if (record == null) {
                total++;
            }
        }
        return total;
    }
}
