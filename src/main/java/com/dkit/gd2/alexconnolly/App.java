package com.dkit.gd2.alexconnolly;

import org.apache.commons.lang3.ArrayUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
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
        int target = 0;
        int[] withoutCspe = new int[]{};
        int[] selectedGrades = new int[]{};
        for(int i = 0; i< grades.length; i++)
        {
            if(codes[i] == 218)
            {
                ArrayUtils.remove(grades, i);
            }
        }
        Arrays.sort(grades);
        ArrayUtils.reverse(grades);
        System.arraycopy(grades,0,selectedGrades,0,4);
        return (calculateAverage(selectedGrades));
    }

    public static double calculateAverage(int[] selectedGrades)
    {
        double average = 0;
        for(int i = 0; i<selectedGrades.length; i++)
        {
            average = average + selectedGrades[i];
        }
        average = average / 5;
        return average;
    }
}
