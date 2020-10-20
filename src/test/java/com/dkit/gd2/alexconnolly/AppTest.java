package com.dkit.gd2.alexconnolly;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public static void selectFiveGradesT1()
    {
        /*Testing with one student*/
        List<Integer> courseCodes = Arrays.asList(1, 2, 3, 13, 41, 52, 81, 125);
        List<Integer> courseMarks = Arrays.asList(62, 85, 49, 54, 60, 73, 62, 69);

        Student test1 = new Student(123456, courseCodes, courseMarks);
        assertEquals(67.6, App.selectFiveGrades(test1), 0.0000001);
    }

    public static void selectFiveGradesT2() {
        /*Testing with 4 students*/
        List<Integer> courseCodes = Arrays.asList(1, 2, 3, 40, 10, 6, 7, 12);
        List<Integer> courseMarks = Arrays.asList(96, 26, 38, 57, 28, 38, 47, 38);

        List<Integer> courseCodes2 = Arrays.asList(1, 2, 3, 27, 82, 100, 137, 565);
        List<Integer> courseMarks2 = Arrays.asList(47, 29, 38, 58, 69, 94, 85, 73);

        List<Integer> courseCodes3 = Arrays.asList(1, 2, 3, 65, 52, 47, 125, 218);
        List<Integer> courseMarks3 = Arrays.asList(45, 79, 23, 67, 34, 65, 92, 76);

        List<Integer> courseCodes4 = Arrays.asList(1, 2, 3, 83, 82, 10, 11, 12);
        List<Integer> courseMarks4 = Arrays.asList(26, 87, 36, 49, 60, 70, 49, 91);

        Student test2s1 = new Student(123456, courseCodes, courseMarks);
        Student test2s2 = new Student(286758, courseCodes, courseMarks);
        Student test2s3 = new Student(307947, courseCodes, courseMarks);
        Student test2s4 = new Student(285746, courseCodes, courseMarks);

        assertEquals(60.4, App.selectFiveGrades(test2s1), 0.0000001);
        assertEquals(73.2, App.selectFiveGrades(test2s2), 0.0000001);
        assertEquals(76.4, App.selectFiveGrades(test2s3), 0.0000001);
        assertEquals(78, App.selectFiveGrades(test2s4), 0.0000001);
    }

    public static void selectFiveGradesT3()
    {
        /*Testing with equal grade values*/
        List<Integer> courseCodes = Arrays.asList(1, 2, 3, 13, 41, 52, 81, 125);
        List<Integer> courseMarks = Arrays.asList(85, 85, 49, 54, 60, 73, 73, 69);

        Student test3 = new Student(123456, courseCodes, courseMarks);
        assertEquals(86.8, App.selectFiveGrades(test3), 0.0000001);
    }

    public static void selectFiveGradesT4()
    {
        /*Testing with CSPE*/
        List<Integer> courseCodes = Arrays.asList(1, 2, 3, 13, 41, 218, 81, 125);
        List<Integer> courseMarks = Arrays.asList(62, 85, 49, 54, 60, 73, 62, 69);

        Student test4 = new Student(123456, courseCodes, courseMarks);
        assertEquals(77.4, App.selectFiveGrades(test4), 0.0000001);
    }
}
