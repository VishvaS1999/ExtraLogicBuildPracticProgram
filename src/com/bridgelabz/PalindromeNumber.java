package com.bridgelabz;

//palindrome Number like 121 -> 121

import java.util.Scanner;

public class PalindromeNumber
{
    public static void main(String[] args)
    {
        int n,reverseInteger=0,remainder,originalInteger;
        System.out.println("Enter Any Number: ");

        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        originalInteger=n;
        while (n!=0)
        {
            remainder = n % 10;
            reverseInteger= reverseInteger * 10 + remainder;
            n=n/10;
        }
        if(originalInteger==reverseInteger)
            System.out.println("Number is Palindrome");
        else
            System.out.println("Number is Not palindrome");
        }
}

