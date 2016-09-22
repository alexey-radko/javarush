package com.javarush.test.level04.lesson10.task04;

import java.io.*;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {   int spalte =10;

        while (spalte > 0){
            System.out.print("S");
            int zeile = 10-1;
            while(zeile > 0){

                System.out.print("S");
                zeile--;
            }
            System.out.println();
            spalte--;

        }

    }
}
