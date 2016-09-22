package com.javarush.test.level04.lesson06.task06;

/* И 18-ти достаточно
Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись «И 18-ти достаточно».
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

        String name = buff.readLine();

        String ageS = buff.readLine();
        int age = Integer.parseInt(ageS);

        if (age < 18){
            System.out.println("Подрасти еще");
        }
        else if( age > 20 ){
            System.out.println("И 18-ти достаточно");
        }
    }
}
