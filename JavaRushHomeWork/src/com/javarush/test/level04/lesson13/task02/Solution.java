package com.javarush.test.level04.lesson13.task02;

import java.io.*;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

        String zahl1 = buff.readLine();
        String zahl2 = buff.readLine();


        int zeile = Integer.parseInt(zahl1);
        int spalte = Integer.parseInt(zahl2);

        for (int i = 0; i <zeile ; i++)
        {
            for (int j = 0; j < spalte ; j++)
            {
                System.out.print(8);
            }
            System.out.println();
        }



    }
}
