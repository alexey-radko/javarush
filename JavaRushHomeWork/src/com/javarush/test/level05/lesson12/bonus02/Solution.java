package com.javarush.test.level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        int[] zahlen = new int[5];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++)
        {
            zahlen[i] = Integer.parseInt(reader.readLine());
        }





        int minimum = min(zahlen);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int [] zahlen)
    {   int min = zahlen[0];
        for (int i = 0; i < zahlen.length ; i++)
        {
            if(zahlen[i]< min){
                min = zahlen[i];
            }
        }

        return min;
    }

}
