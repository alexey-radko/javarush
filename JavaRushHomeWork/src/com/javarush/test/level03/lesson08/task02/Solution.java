package com.javarush.test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
«Имя» получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String name = buff.readLine();
        String sMoney = buff.readLine();
        String sYears = buff.readLine();
        int nMoney = Integer.parseInt(sMoney);
        int nYears = Integer.parseInt(sYears);
        System.out.println(name + " получает " + nMoney + " через " + nYears + " лет.");

       // System.out.println(name+ " получает "+ moneyInt+ " через "+ageInt+" лет.");


    }
}