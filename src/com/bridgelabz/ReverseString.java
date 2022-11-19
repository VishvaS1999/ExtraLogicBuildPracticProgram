package com.bridgelabz;

import java.util.Scanner;

public class ReverseString
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        {
            String reverse=" ";

            System.out.println("Enter a string:-");
            String str=sc.nextLine();

            int length=str.length();

            for(int i=length-1; i>=0; i--)
            {
                reverse=reverse +str.charAt(i);
            }
            System.out.println("The reverse String is:- " + reverse);
        }

    }
}
