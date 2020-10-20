package com.dkit.gd2.alexconnolly;

import java.util.ArrayList;

public class Student {
    private int studentNum;
    private ArrayList<Integer> courseCodes;
    private ArrayList<Integer> courseMarks;


    public Student(int studentNum, ArrayList<Integer> courseCodes, ArrayList<Integer> courseMarks) {
        this.studentNum = studentNum;
        this.courseCodes = courseCodes;
        this.courseMarks = courseMarks;
    }

    public int getStudentNum()
    {
        return studentNum;
    }

    public ArrayList<Integer> getCourseCode()
    {
        return courseCodes;
    }

    public ArrayList<Integer> getCourseMark()
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

