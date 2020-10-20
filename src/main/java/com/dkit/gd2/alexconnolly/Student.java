package com.dkit.gd2.alexconnolly;

import java.util.ArrayList;
import java.util.List;

public class Student extends ArrayList<Student> {
    private int studentNum;
    private ArrayList<Integer> courseCodes;
    private ArrayList<Integer> courseMarks;


    public Student(int studentNum, List<Integer> courseCodes, List<Integer> courseMarks) {
        this.studentNum = studentNum;
        this.courseCodes = courseCodes;
        this.courseMarks = courseMarks;
    }

    public int getStudentNum()
    {
        return studentNum;
    }

    public ArrayList<Integer> getCourseCodes()
    {
        return courseCodes;
    }

    public ArrayList<Integer> getCourseMarks()
    {
        return courseMarks;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "studentNum=" + studentNum +
                ", courseCode=" + courseCodes +
                ", courseMark=" + courseMarks +
                '}';
    }
}

