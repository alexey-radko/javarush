package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String aS = buff.readLine();
        int a = Integer.parseInt(aS);

        String bS = buff.readLine();
        int b = Integer.parseInt(bS);

        String cS = buff.readLine();
        int c = Integer.parseInt(cS);








        if(a < b && a > c){
            System.out.println(a);
        }

        if(a < c && a > b){
            System.out.println(a);
        }
        else if (b < a && b > c){
            System.out.println(b);

        }
        else if (b < c && b > a){
            System.out.println(b);

        }
        else if (c < a && c > b){
            System.out.println(c);
        }
        else if (c < b && c > a){
            System.out.println(c);
        }





        else {
            System.out.println(b);
        }
    }
}
