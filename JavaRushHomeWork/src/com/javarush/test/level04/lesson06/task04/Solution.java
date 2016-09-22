package com.javarush.test.level04.lesson06.task04;

/* Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны». Если имена разные,
 но их длины равны – вывести сообщение – «Длины имен равны».
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

        String str = buff.readLine();

        String str1 = buff.readLine();



        if(str.equals(str1)){
            System.out.println("Имена идентичны");
        }else{
            if(str1.length() == str.length()){
                System.out.println("Длины имен равны");
            }
        }

    }
}
