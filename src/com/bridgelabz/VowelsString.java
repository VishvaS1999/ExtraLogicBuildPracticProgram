package com.bridgelabz;

import java.util.Scanner;

public class VowelsString
{
    public static void main(String[] args)
    {
        int vowelCount = 0, consonantCount = 0;

        String str = "This is java Program";

        //Converting to lower case to reduce the comparisons
        str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++)
        {
            //Checks given a character is a vowel
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {

                vowelCount++;
            }
            //Checks given a character is a consonant
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z')
            {
                consonantCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);

    }

}
