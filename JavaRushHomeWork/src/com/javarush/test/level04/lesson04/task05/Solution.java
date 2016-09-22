package com.javarush.test.level04.lesson04.task05;

/* Положительное и отрицательное число
Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное,
 то прибавить единицу.
Вывести результат на экран.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String zahlS = buff.readLine();
        int zahl = Integer.parseInt(zahlS);

        if (zahl  >=0  ){

            System.out.println(zahl *2);
        }
        else {
            System.out.println( zahl +1 );
        }

    }

}