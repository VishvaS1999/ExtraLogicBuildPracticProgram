package com.bridgelabz;

import java.util.Scanner;

public class LargestNumberInArray
{
    public static void main(String[] args)
    {
        int max;
        int array[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Elements:-");

        for (int i = 0; i < array.length; i++)
        {
            array[i] = sc.nextInt();
        }
        max = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] > max)
            {
                max = array[i];
            }
        }
        System.out.println("Largest Array Element is: " + max);
    }
}

