package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String str = buff.readLine();
        int zahl1 = Integer.parseInt(str);
        String str1 = buff.readLine();
        int zahl2 = Integer.parseInt(str1);



        if(zahl1 > zahl2){
            System.out.println(zahl2);
        }else{
            System.out.println(zahl1);
        }

    }
}