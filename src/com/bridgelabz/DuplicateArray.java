package com.bridgelabz;

import java.util.Scanner;

public class DuplicateArray
{
    public static void main(String[] args)
    {
        int array[]=new int[]{3,5,4,3,1,5};
        System.out.println("Duplicate Elements in array");

        for(int i=0; i<6; i++)
        {
            for(int j=i+1; j<6; j++)
            {
                if(array[i]==array[j])
                {
                    System.out.println(array[j]);
                }
            }
        }
    }
}
