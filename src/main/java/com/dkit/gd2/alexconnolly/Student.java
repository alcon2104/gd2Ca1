package com.dkit.gd2.alexconnolly;

public class Student {
    public int studentNum;
    public int[] courseCode;
    public int[] courseMark;

    public Student(int studentNum, int[] courseCode, int[] courseMark) {
        this.studentNum = studentNum;
        this.courseCode = courseCode;
        this.courseMark = courseMark;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public int[] getCourseCode() {
        return courseCode;
    }

    public int[] getCourseMark() {
        return courseMark;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public void setCourseCode(int[] courseCode) {
        this.courseCode = courseCode;
    }

    public void setCourseMark(int[] courseMark) {
        this.courseMark = courseMark;
    }
}
