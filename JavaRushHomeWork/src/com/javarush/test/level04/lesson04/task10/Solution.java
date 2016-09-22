package com.javarush.test.level04.lesson04.task10;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String str0 = buff.readLine();
        int zahl0  = Integer.parseInt(str0);
        String str1 = buff.readLine();
        int zahl1  = Integer.parseInt(str1);
        String str2 = buff.readLine();
        int zahl2  = Integer.parseInt(str2);


        if ( zahl0 == zahl1 && zahl0 == zahl2){
            System.out.println( zahl0+
                    " " +zahl1+
                    " "+ zahl2);
        } else if (zahl0 == zahl1 && zahl0 != zahl2){
            System.out.println(zahl0 +
                    " "+zahl1);
        } else if (zahl0 == zahl2 && zahl0 != zahl1){
            System.out.println(zahl0 +
                    " "+zahl2);
        }else if (zahl1 == zahl2 && zahl0 != zahl1)
        {
            System.out.println(zahl1 +
                    " " + zahl2);
        }

    }
}