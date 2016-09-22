package com.javarush.test.level07.lesson09.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* Удвой слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведи результат на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Считать строки с консоли и объявить ArrayList list тут
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 1; i++)
        {
            list.add(bis.readLine());
        }



        ArrayList<String> result = doubleValues(list);

        for(String s : result){
            System.out.println(s);
        }


        Set<String> set = new HashSet<>();
        set.add("mama");
        set.add("papa");
        set.add("schwester");

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String text = iterator.next();
            System.out.println(text);
        }


        for(String s : set){
            System.out.println(s);
        }


        Map<String,String> map = new TreeMap<String, String>();
        map.put("1","mama");
        map.put("1","mama");
        map.put("1","mama");


    }

    public static ArrayList<String> doubleValues(ArrayList<String> list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            list.add(i, list.get(i));
            i++;
        }
        return list;
    }



}
