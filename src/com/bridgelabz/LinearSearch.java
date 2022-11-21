package com.bridgelabz;

import java.util.Scanner;

public class LinearSearch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter Five Elements:");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        System.out.println("Enter Element you Want Search: ");
        int search = sc.nextInt();
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == search)
            {
                System.out.println(search + " At Position " + i);
                break;
            }
    }
}
