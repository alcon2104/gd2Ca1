package com.dkit.gd2.alexconnolly;

import org.apache.commons.lang3.ArrayUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

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
        /*
         * Setting up a new ArrayList that the 5 selected courseMarks
         * will be entered into
         */
        int[] selectedGrades = new int[5];
        for(Student student : students) {
            Collections.sort(student.getCourseCodes());
            System.out.println(student.getCourseCodes());
            if (student.getCourseCodes().contains(1) || student.getCourseCodes().contains(2) ||
                    student.getCourseCodes().contains(3)) {
                /*
                 * The method will add the courseMarks that correspond with courseCode 1, 2 or 3 to the selectedGrades ArrayList, and then removes
                 * them from the courseMarks ArrayList so that they won't be re-entered at the end of the method
                 */
                selectedGrades[0] = (student.getCourseMarks().get(student.getCourseCodes().indexOf(1)));
                selectedGrades[1] = (student.getCourseMarks().get(student.getCourseCodes().indexOf(2)));
                selectedGrades[2] = (student.getCourseMarks().get(student.getCourseCodes().indexOf(3)));

                student.getCourseMarks().remove(0);
                student.getCourseMarks().remove(0);
                student.getCourseMarks().remove(0);

            }

            Collections.sort(student.getCourseMarks(), Collections.reverseOrder());


            selectedGrades[3] = (student.getCourseMarks().get(0));
            selectedGrades[4] = (student.getCourseMarks().get(1));
        }
        return (calculateAverage(selectedGrades, students));
    }

    public static double calculateAverage(int[] selectedGrades, ArrayList<Student> students)
    {
        double average = 0;
        for(int i = 0; i<selectedGrades.length; i++)
        {
            /*
             * Adds all of the values together and sets the total as the average value
             */
            average = average + selectedGrades[i];
        }
        /*
         * Divides the average by the number of marks sent into the method, and returns the answer.
         */
        average = average / 5;

        /*
        * Prints out student number and corresponding average for each test
        */
        for(Student student : students)
        {
            System.out.println(student.getStudentNum() + ", " + average);
        }

        return average;
    }
}