package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       /*
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        int [] array = new int[3];


        String str = buff.readLine();
        array[0] = Integer.parseInt(str);
        String str1 = buff.readLine();
        array[1] = Integer.parseInt(str1);
        String str3 = buff.readLine();
        array[2] = Integer.parseInt(str3);


        for (int i = 0; i <array.length-1 ; i++)
        {
            if(array[i] < array[i+1]){
                int tmp = array[i];
                array[i] = array[i+1];
                array[i+1] = tmp;
            }
        }
        for (int i : array)
        {
            System.out.println(i);
        }

*/

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

        String str = buff.readLine();
        int a = Integer.parseInt(str);
        String str1 = buff.readLine();
        int b = Integer.parseInt(str1);
        String str3 = buff.readLine();
        int c  = Integer.parseInt(str3);




        if (a < b && a > c){
            System.out.println(b  +
                    " " + a +
                    " "+c);
        }
        else if(a < b && a < c && b > c){
            System.out.println(b  +
                    " " + c +
                    " "+a);
        }
        else if( b < a && b > c ){

            System.out.println(a  +
                    " " + b +
                    " "+c);
        }
        else if( b < a && b < c && a > c ){

            System.out.println(a  +
                    " " + c +
                    " "+b);
        }



        else if( c > a && a > b){
            System.out.println(c  +
                    " " + a +
                    " "+b);


        }
        else if( c > a && a < b){
            System.out.println(c  +
                    " " + b +
                    " "+a);


        }






    }
}
