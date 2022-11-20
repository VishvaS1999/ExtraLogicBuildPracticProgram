package com.bridgelabz;

import java.util.Scanner;

public class SmallestNumberInArray
{
    public static void main(String[] args)
    {
        int min;
        int array[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Elements:-");

        for(int i=0; i<array.length; i++)
        {
            array[i]=sc.nextInt();
        }
        min=array[0];
        for(int i=1; i<array.length; i++)
        {
            if(array[i]<min)
            {
                min=array[i];
            }
        }
        System.out.println("Smallest Array Element is: " +min);
    }
}
