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
    public void selectFiveGradesT1()
    {
        /*Testing with one student*/
        ArrayList<Integer> courseCodes = new ArrayList<>();/*Arrays.asList(1, 2, 3, 13, 41, 52, 81, 125);*/
        ArrayList<Integer> courseMarks = new ArrayList<>();/*Arrays.asList(62, 85, 49, 54, 60, 73, 62, 69);*/

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

        ArrayList<Student> students = new ArrayList<>();
        Student test1 = new Student(123456, courseCodes, courseMarks);
        students.add(test1);

        assertEquals( 67.6, App.selectFiveGrades(students), 0.0000001);
    }

    public void selectFiveGradesT2() {
        /*Testing with 4 students*/
        ArrayList<Integer> courseCodes = new ArrayList<>();
        ArrayList<Integer> courseMarks = new ArrayList<>();

        ArrayList<Integer> courseCodes2 = new ArrayList<>();
        ArrayList<Integer> courseMarks2 = new ArrayList<>();

        ArrayList<Integer> courseCodes3 = new ArrayList<>();
        ArrayList<Integer> courseMarks3 = new ArrayList<>();

        ArrayList<Integer> courseCodes4 = new ArrayList<>();
        ArrayList<Integer> courseMarks4 = new ArrayList<>();

        courseCodes.add(1);
        courseCodes.add(2);
        courseCodes.add(3);
        courseCodes.add(40);
        courseCodes.add(10);
        courseCodes.add(6);
        courseCodes.add(7);
        courseCodes.add(12);
        courseMarks.add(96);
        courseMarks.add(26);
        courseMarks.add(38);
        courseMarks.add(57);
        courseMarks.add(28);
        courseMarks.add(38);
        courseMarks.add(47);
        courseMarks.add(38);

        courseCodes2.add(1);
        courseCodes2.add(2);
        courseCodes2.add(3);
        courseCodes2.add(27);
        courseCodes2.add(82);
        courseCodes2.add(100);
        courseCodes2.add(137);
        courseCodes2.add(565);
        courseMarks2.add(47);
        courseMarks2.add(29);
        courseMarks2.add(38);
        courseMarks2.add(58);
        courseMarks2.add(69);
        courseMarks2.add(94);
        courseMarks2.add(85);
        courseMarks2.add(73);

        courseCodes3.add(1);
        courseCodes3.add(2);
        courseCodes3.add(3);
        courseCodes3.add(65);
        courseCodes3.add(52);
        courseCodes3.add(47);
        courseCodes3.add(125);
        courseCodes3.add(12);
        courseMarks3.add(45);
        courseMarks3.add(79);
        courseMarks3.add(23);
        courseMarks3.add(67);
        courseMarks3.add(34);
        courseMarks3.add(65);
        courseMarks3.add(92);
        courseMarks3.add(76);

        courseCodes4.add(1);
        courseCodes4.add(2);
        courseCodes4.add(3);
        courseCodes4.add(83);
        courseCodes4.add(82);
        courseCodes4.add(10);
        courseCodes4.add(11);
        courseCodes4.add(12);
        courseMarks4.add(26);
        courseMarks4.add(87);
        courseMarks4.add(36);
        courseMarks4.add(49);
        courseMarks4.add(60);
        courseMarks4.add(70);
        courseMarks4.add(49);
        courseMarks4.add(91);

        Student test2s1 = new Student(123456, courseCodes, courseMarks);
        Student test2s2 = new Student(286758, courseCodes2, courseMarks2);
        Student test2s3 = new Student(307947, courseCodes3, courseMarks3);
        Student test2s4 = new Student(285746, courseCodes4, courseMarks4);

        ArrayList<Student> students = new ArrayList<>();
        students.add(test2s1);
        students.add(test2s2);
        students.add(test2s3);
        students.add(test2s4);

        assertEquals(52.8, App.selectFiveGrades(students), 0.0000001);
        assertEquals(58.6, App.selectFiveGrades(students), 0.0000001);
        assertEquals(63, App.selectFiveGrades(students), 0.0000001);
        assertEquals(62, App.selectFiveGrades(students), 0.0000001);
    }

    public void selectFiveGradesT3()
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

        ArrayList<Student> students = new ArrayList<>();
        Student test3 = new Student(123456, courseCodes, courseMarks);
        students.add(test3);

        assertEquals(73, App.selectFiveGrades(students), 0.0000001);
    }

    public void selectFiveGradesT4()
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

        ArrayList<Student> students = new ArrayList<>();
        Student test4 = new Student(123456, courseCodes, courseMarks);
        students.add(test4);

        assertEquals(67.6, App.selectFiveGrades(students), 0.0000001);
    }

    public void selectFiveGradesT5()
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

        ArrayList<Student> students = new ArrayList<>();
        Student test5 = new Student(123456, courseCodes, courseMarks);
        students.add(test5);

        assertEquals(68.6, App.selectFiveGrades(students), 0.0000001);
    }
}
