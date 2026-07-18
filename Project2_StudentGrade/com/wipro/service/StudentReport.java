package com.wipro.service;

import com.wipro.bean.Student;
import com.wipro.exception.*;

public class StudentReport {

    public String findGrade(Student studentObject) {

        int[] marksArray = studentObject.getMarks();
        int totalMarks = 0;

        for (int score : marksArray) {
            if (score < 35) {
                return "F";
            }
            totalMarks += score;
        }

        if (totalMarks <= 150) {
            return "D";
        } else if (totalMarks <= 200) {
            return "C";
        } else if (totalMarks <= 250) {
            return "B";
        } else {
            return "A";
        }
    }

    public String validate(Student studentObject)
            throws NullStudentException, NullNameException, NullMarksArrayException {

        if (studentObject == null) {
            throw new NullStudentException();
        }

        if (studentObject.getName() == null) {
            throw new NullNameException();
        }

        if (studentObject.getMarks() == null) {
            throw new NullMarksArrayException();
        }

        return findGrade(studentObject);
    }
}
