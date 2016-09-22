package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int [] data1 = new int[20];
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i <data1.length ; i++)
        {
            data1[i] = Integer.parseInt(buff.readLine());
        }

        int[] left = new int [10];
        int[] right = new int[10];

        for (int i = 0; i < data1.length ; i++)
        {
            if (i < 10){
                left[i] = data1[i];
            }
            else{
                right[i-10] = data1[i];
            }
        }

        for(int i : right){
            System.out.println(i);
        }

    }
}
