package com.dkit.gd2.alexconnolly;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
/**
 * Hello world!
 *
 */
public class App 
{
    public double selectFiveGrades(int[] codes, int[] grades)
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

    public double calculateAverage(int[] selectedGrades)
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
