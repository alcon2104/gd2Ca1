package com.dkit.gd2.alexconnolly;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void selectFiveGradesT1()
    {
        /*Testing with one student*/
        ArrayList<Integer> courseCodes = new ArrayList<>();/*Arrays.asList(1, 2, 3, 13, 41, 52, 81, 125);*/
        ArrayList<Integer> courseMarks = new ArrayList<>();/*Arrays.asList(62, 85, 49, 54, 60, 73, 62, 69);*/

        /*
         * Adding values to courseCode and courseMark ArrayLists
         */
        courseCodes.add(1);
        courseCodes.add(2);
        courseCodes.add(3);
        courseCodes.add(13);
        courseCodes.add(41);
        courseCodes.add(52);
        courseCodes.add(81);
        courseCodes.add(125);
        courseMarks.add(62);
        courseMarks.add(85);
        courseMarks.add(49);
        courseMarks.add(54);
        courseMarks.add(60);
        courseMarks.add(73);
        courseMarks.add(62);
        courseMarks.add(69);

        /*
         * Setting up a new student object that includes its own
         * student number and the values in the above ArrayLists
         */
        Student test1 = new Student(123456, courseCodes, courseMarks);

        /*
         * Checks if the expected outcome of the methods in the
         * App.java file will match what the methods return.
         */
        ArrayList<Student> students = new ArrayList<>();
        students.add(test1);

        assertEquals( 67.6, App.selectFiveGrades(students), 0.0000001);
    }



    @Test
    public void selectFiveGradesT2()
    {
        /*Testing with equal grade values*/
        ArrayList<Integer> courseCodes = new ArrayList<>();
        ArrayList<Integer> courseMarks = new ArrayList<>();

        courseCodes.add(1);
        courseCodes.add(2);
        courseCodes.add(3);
        courseCodes.add(13);
        courseCodes.add(41);
        courseCodes.add(52);
        courseCodes.add(81);
        courseCodes.add(125);
        courseMarks.add(85);
        courseMarks.add(85);
        courseMarks.add(49);
        courseMarks.add(54);
        courseMarks.add(60);
        courseMarks.add(73);
        courseMarks.add(73);
        courseMarks.add(69);

        Student test2 = new Student(123456, courseCodes, courseMarks);
        ArrayList<Student> students = new ArrayList<>();
        students.add(test2);


        assertEquals(73, App.selectFiveGrades(students), 0.0000001);
    }

    @Test
    public void selectFiveGradesT3()
    {
        /*Testing with CSPE*/
        ArrayList<Integer> courseCodes = new ArrayList<>();
        ArrayList<Integer> courseMarks = new ArrayList<>();

        courseCodes.add(1);
        courseCodes.add(2);
        courseCodes.add(3);
        courseCodes.add(13);
        courseCodes.add(41);
        courseCodes.add(218);
        courseCodes.add(81);
        courseCodes.add(125);
        courseMarks.add(62);
        courseMarks.add(85);
        courseMarks.add(49);
        courseMarks.add(54);
        courseMarks.add(60);
        courseMarks.add(73);
        courseMarks.add(62);
        courseMarks.add(69);

        Student test3 = new Student(123456, courseCodes, courseMarks);
        ArrayList<Student> students = new ArrayList<>();
        students.add(test3);

        assertEquals(67.6, App.selectFiveGrades(students), 0.0000001);
    }

    @Test
    public void selectFiveGradesT4()
    {
        /*Testing with Maths Irish and English in different places than the beginning*/
        ArrayList<Integer> courseCodes = new ArrayList<>();
        ArrayList<Integer> courseMarks = new ArrayList<>();

        courseCodes.add(11);
        courseCodes.add(1);
        courseCodes.add(12);
        courseCodes.add(2);
        courseCodes.add(10);
        courseCodes.add(3);
        courseCodes.add(81);
        courseCodes.add(125);
        courseMarks.add(61);
        courseMarks.add(85);
        courseMarks.add(49);
        courseMarks.add(54);
        courseMarks.add(60);
        courseMarks.add(73);
        courseMarks.add(62);
        courseMarks.add(69);

        Student test4 = new Student(123456, courseCodes, courseMarks);
        ArrayList<Student> students = new ArrayList<>();
        students.add(test4);

        assertEquals(67.4, App.selectFiveGrades(students), 0.0000001);
    }
}