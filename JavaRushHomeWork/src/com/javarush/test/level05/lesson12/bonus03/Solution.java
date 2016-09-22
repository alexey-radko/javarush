package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());


        int[] zahlen = new int[count];



        for (int i = 0; i < zahlen.length; i++)
        {
            zahlen[i] = Integer.parseInt(reader.readLine());
        }



        int maximum = max(zahlen) ;




        System.out.println(maximum);


    }


    public static int max(int [] zahlen)
    {   int max = zahlen[0];
        for (int i = 0; i < zahlen.length ; i++)
        {
            if(zahlen[i] > max){
                max = zahlen[i];
            }
        }

        return max;
    }









}
