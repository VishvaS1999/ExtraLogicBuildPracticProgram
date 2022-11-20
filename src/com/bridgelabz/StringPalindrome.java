package com.bridgelabz;

import java.util.Scanner;

public class StringPalindrome
{
    public static void main(String[] args)
    {
        String reverse = "";

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:-");
        String str = sc.nextLine();

            int length = str.length();

            for (int i = length-1; i >= 0; i--)
            {
                reverse = reverse + str.charAt(i);
            }
            if (str.equals(reverse))
            {
                System.out.println(str+ " is a Palindrome");
            }
            else
            {
                System.out.println(str+ "is not a Palindrome");
            }
    }
}
