package com.bridgelabz;

public class FrequencyOfCharacter
{
    public static void main(String[] args)
    {
        String s = "javaProgram";
        char[] ch = s.toCharArray();
        int size = ch.length;
        int counter = 0;
        for (int i = 0; i < size; ++i)
        {
            counter=0;

            for (int j = 0; j < size; ++j)
            {
                if (ch[j] == ch[i])
                {
                    counter++;
                }
            }
            System.out.println("the Character " + ch[i]+ " is " +counter+ " times");
        }
    }
}
