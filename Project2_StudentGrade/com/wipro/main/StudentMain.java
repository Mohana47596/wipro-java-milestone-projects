package com.wipro.main;

import com.wipro.bean.Student;
import com.wipro.exception.*;
import com.wipro.service.StudentReport;
import com.wipro.service.StudentService;

public class StudentMain {

    static Student[] studentData = new Student[4];

    static {
        studentData[0] = new Student("Sekar", new int[]{35, 35, 35});
        studentData[1] = new Student(null, new int[]{11, 22, 33});
        studentData[2] = null;
        studentData[3] = new Student("Manoj", null);
    }

    public static void main(String[] args) {

        StudentReport reportService = new StudentReport();
        StudentService countService = new StudentService();

        System.out.println("Grades Calculation:");

        for (Student record : studentData) {
            String outcome;
            try {
                outcome = reportService.validate(record);
            } catch (NullNameException e) {
                outcome = e.toString();
            } catch (NullMarksArrayException e) {
                outcome = e.toString();
            } catch (NullStudentException e) {
                outcome = e.toString();
            }
            System.out.println("GRADE= " + outcome);
        }

        System.out.println("Number of Objects with Marks array as null = "
                + countService.findNumberOfNullMarks(studentData));
        System.out.println("Number of Objects with Name as null = "
                + countService.findNumberOfNullNames(studentData));
        System.out.println("Number of Objects that are entirely null = "
                + countService.findNumberOfNullObjects(studentData));
    }
}
