package com.bridgelabz;

import java.util.Scanner;

//factorial n = 4 = 4 * 3 * 2 * 1 = 24
public class FactorialNumber
{
    public static void main(String args[])
    {
        int n,fact=1;
        System.out.println("Enter Any Number ");

        Scanner s=new Scanner(System.in);
        n=s.nextInt();

        for(int i=1; i<=n; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial Number is: " +fact);
    }
}
