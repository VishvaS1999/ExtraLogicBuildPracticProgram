package com.bridgelabz;

// Fibonacci Series is 0 1 1 2 3 5 8 13....

import java.util.Scanner;

public class FibonacciSeries
{
    public static void main(String args[])
    {
        int a=0, b=1, c, number;

        System.out.println("Enter Number:");

        Scanner sc=new Scanner(System.in);
         number=sc.nextInt();

        for(int i=1; i<=number; i++)
        {
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}
