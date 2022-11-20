package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class SortAnArray
{
    public static void main(String[] args)
    {
        int temp;
        int array[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number in Array");

       for(int i=0; i<5; i++)
       {
           array[i]=sc.nextInt();
       }
       for(int i=0;i<5;i++)
       {
           for(int j=i+1; j<5; j++)
           {
               if(array[i]>array[j])
               {
                   temp=array[i];
                   array[i]=array[j];
                   array[j]=temp;

               }
           }
       }
       System.out.println("Sorted Number in Array");
       for(int i=0;i<5;i++)
       {

           System.out.print(array[i]+" ");
       }

    }
}
