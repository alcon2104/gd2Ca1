package com.dkit.gd2.alexconnolly;

import java.util.ArrayList;
import java.util.List;

public class Student extends ArrayList<Student> {
    /*
    * Sets up and object class for every student in the students.txt
    * file and any others that are used in the test file
    */
    private int studentNum;
    private ArrayList<Integer> courseCodes;
    private ArrayList<Integer> courseMarks;


    public Student(int studentNum, ArrayList<Integer> courseCodes, ArrayList<Integer> courseMarks) {
        this.studentNum = studentNum;
        this.courseCodes = courseCodes;
        this.courseMarks = courseMarks;
    }

    /*
    * Getters are called to use specific values relating to a Student
    * object, so that they can be used in methods and single commands.
    */
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

    /*
    * toString method will print out a Student object, including
    * all of its values.
    */
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

