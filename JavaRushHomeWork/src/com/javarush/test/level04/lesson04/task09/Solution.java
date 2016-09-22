package com.javarush.test.level04.lesson04.task09;

/* Светофор
Работа светофора для пешеходов запрограммирована следующим образом: в начале каждого часа в течение
трех минут горит зеленый сигнал,
затем в течение одной минуты — желтый, а потом в течение одной минуты — красный, затем опять зеленый
горит три минуты и т. д.
Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
Определить, сигнал какого цвета горит для пешеходов в этот момент.
Результат вывести на экран в следующем виде:
"зеленый" - если горит зеленый цвет, "желтый" - если горит желтый цвет, "красный" - если горит красный
цвет.
Пример для числа 2.5:
зеленый
Пример для числа 3:
желтый
Пример для числа 4:
красный
Пример для числа 5:
зеленый

[2.9, 4.9, 6.9, 8.9, 10.9, 12.9, 14.9, 16.9, 18.9, 20.9, 22.9, 24.9, 26.9, 28.9, 30.9, 32.9,
 34.9, 36.9, 38.9, 40.9, 42.9, 44.9, 46.9, 48.9, 50.9, 52.9, 54.9, 56.9, 58.9]
*/

import java.io.*;
import java.util.Arrays;

public class Solution
{
    public static void main(String[] args) throws Exception
    {

//        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
//        String str = buff.readLine();
//        double jahr = Double.parseDouble(str);
//
//
//        if ( jahr  % 5 <3 || jahr <3)
//        {
//            System.out.println("зеленый");
//        }
//
//            else if(jahr % 5 > 3 &&  jahr % 5 <4  || (jahr >= 3 && jahr < 4) ){
//            System.out.println("желтый");
//            }
//
//            else if(jahr % 5 > 4 && jahr % 5 <5 || (jahr >= 4 && jahr < 5) ){
//            System.out.println("красный");
//
//
//        }

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String vvod = rd.readLine();
        float t = Float.parseFloat(vvod);

        if(t % 5 == 0 || t % 5 > 0 && t % 5 < 3 ) System.out.println(" зеленый");
        else if(t % 5 == 3 || t % 5 > 3 && t % 5 < 4) System.out.println(" желтый");
        else if(t % 5 == 4 || t % 5 > 4 && t % 5 < 5) System.out.println(" красный");



    }
}