package com.javarush.test.level04.lesson10.task03;

import java.io.*;

/* Хорошего не бывает много
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

        String text = buff.readLine();

        String ageS = buff.readLine();
        int count = Integer.parseInt(ageS);


        while (count >0){
            System.out.println(text);
            count--;
        }





    }
}
