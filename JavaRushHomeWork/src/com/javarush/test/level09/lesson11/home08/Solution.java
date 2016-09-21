package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;
import java.util.Collections;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел.
Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно.
 Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        //напишите тут ваш код
        int[] five = new int[]{6,3,2,10,0};


        int[] two = new  int[]{89,23};


        int[] vor = new int[]{10,0,78,5};


        int[] seven = new  int[]{89,3,4,64,76,45,3};


        int[] zero = new  int[0];

        ArrayList<int[]> result = new ArrayList<>();
        Collections.addAll(result,five,two,vor,seven,zero);

        return result;



    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
