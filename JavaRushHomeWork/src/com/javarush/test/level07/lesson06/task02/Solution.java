package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader buff  = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++)
        {
            list.add(buff.readLine());
        }


        int max = list.get(0).length();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > max) {
                max = list.get(i).length();
            }
        }


        for (int i = 0; i < 5; i++) {
            if (max == list.get(i).length()) {
                System.out.println(list.get(i));
            }
        }

/*
        ArrayList<String> list1 = new ArrayList<>();

        BufferedReader buff  = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++)
        {
            list.add(buff.readLine());
        }

        String max = list.get(0);




        for (int i = 0; i < list.size(); i++)
        {
            if (max.length() <= list.get(i).length() ){
                max = list.get(i);



            }

        }

        list1.add(max);

        for (int i = 0; i < list.size(); i++)
        {
            if (max.length() == list.get(i).length() && !max.equals(list.get(i)) ){

                list1.add(list.get(i));

            }
        }

        for (String s : list1){
            System.out.println(s);
        }


*/




    }
}
