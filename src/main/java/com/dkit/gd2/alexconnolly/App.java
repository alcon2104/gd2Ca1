package com.dkit.gd2.alexconnolly;

import org.apache.commons.lang3.ArrayUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public void main(String[] args)
    {
        ArrayList<Student> students = new ArrayList<>();
        readStudentsFromFile(students);
        System.out.println(Arrays.toString(students.toArray()));
        selectFiveGrades(students);
    }

    private static void readStudentsFromFile(ArrayList<Student> students)
    {
        try(Scanner studFile = new Scanner(new BufferedReader(new FileReader("students.txt"))))
        {
            while(studFile.hasNextLine())
            {
                String input = studFile.nextLine();
                String[] data = input.split(",");
                int studentNumber = Integer.parseInt(data[0]);
                ArrayList<Integer> tempCodes = new ArrayList<>();
                ArrayList<Integer> tempMarks = new ArrayList<>();
                for(int i=1; i<data.length;i=i+2)
                {
                    tempCodes.add(Integer.parseInt(data[i]));
                    tempMarks.add(Integer.parseInt(data[i+1]));
                }
                students.add(new Student(studentNumber, tempCodes, tempMarks));
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    public static double selectFiveGrades(ArrayList<Student> students)
    {
        int[] withoutCspe = new int[]{};
        ArrayList<Integer>selectedGrades = new ArrayList<>();
        for(Student student : students)
        {
            if(student.getCourseCodes().contains(1) || student.getCourseCodes().contains(2) ||
                    student.getCourseCodes().contains(3))
            {
                selectedGrades.add(student.getCourseMarks().indexOf(student.getCourseCodes().indexOf(1)));
                selectedGrades.add(student.getCourseMarks().indexOf(student.getCourseCodes().indexOf(2)));
                selectedGrades.add(student.getCourseMarks().indexOf(student.getCourseCodes().indexOf(3)));

//                student.remove(student.getCourseMarks().indexOf(student.getCourseCodes().indexOf(1)));
//                student.remove(student.getCourseMarks().indexOf(student.getCourseCodes().indexOf(2)));
//                student.remove(student.getCourseMarks().indexOf(student.getCourseCodes().indexOf(3)));
            }

            if(student.getCourseCodes().contains(218))
            {
                student.getCourseMarks().remove(student.getCourseMarks().indexOf(student.getCourseCodes().indexOf(218)));
            }

            Collections.reverse(student.getCourseMarks());
            selectedGrades.add(student.getCourseMarks().get(0));
            selectedGrades.add(student.getCourseMarks().get(1));
        }
        return (calculateAverage(selectedGrades));
    }

    public static double calculateAverage(ArrayList<Integer> selectedGrades)
    {
        double average = 0;
        for(int i = 0; i<selectedGrades.size(); i++)
        {
            average = average + selectedGrades.get(i);
        }
        return average / 5;
    }
}
