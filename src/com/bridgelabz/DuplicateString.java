package com.bridgelabz;

import java.util.Scanner;

public class DuplicateString
{
    public static void main(String[] args)
    {
        System.out.println("Duplicate Character is");
        String str = "java programming";
        int length = str.length();
        char[] ch = str.toCharArray();
        for (int i = 0; i < length; i++)
        {
            for (int j = i + 1; j < length; j++)
            {
                if (ch[i] == ch[j])
                {
                    System.out.print(ch[j]);
                    break;
                }
            }
        }
    }
}