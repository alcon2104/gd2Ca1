package com.dkit.gd2.alexconnolly;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Students
{
    public static void main(String[] args)
    {
        Scanner fileScanner = null;
        try
        {
            fileScanner = new Scanner(new FileReader("students.txt"));
            fileScanner.useDelimiter(",");
            while (fileScanner.hasNextLine())
            {

            }
        }
        catch (FileNotFoundException fne)
        {
            System.out.println("An error occurred.");
            fne.printStackTrace();
        }
        finally
        {
            if(fileScanner != null)
            {
                fileScanner.close();
            }
        }
    }
}
