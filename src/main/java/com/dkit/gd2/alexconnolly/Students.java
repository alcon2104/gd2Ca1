package com.dkit.gd2.alexconnolly;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Students
{
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        readStudentsFromFile(students);
        System.out.println(Arrays.toString(students.toArray()));
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




}
