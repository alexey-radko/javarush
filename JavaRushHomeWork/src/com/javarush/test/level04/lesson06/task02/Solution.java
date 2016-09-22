package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
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
        String str3 = buff.readLine();
        int zahl3 = Integer.parseInt(str3);
        String str4 = buff.readLine();
        int zahl4 = Integer.parseInt(str4);

        if (zahl1 > zahl2 && zahl1 > zahl3 && zahl1 > zahl4){
            System.out.println(zahl1);

        }
        else if (zahl2 > zahl1 && zahl2 > zahl3 && zahl2 > zahl4){
            System.out.println(zahl2);
        }
        else if (zahl3 > zahl1 && zahl3 > zahl2 && zahl3 > zahl4){
            System.out.println(zahl3);
        }
        else {
            System.out.println(zahl4);
        }




    }
}
