package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.

*/


public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        HashMap<String,Cat> date = new HashMap<>();
        date.put("Wasjka",new Cat("Wasjka"));
        date.put("Wasik",new Cat("Wasik"));
        date.put("Kiska",new Cat("Kiska"));
        date.put("Kis",new Cat("Kis"));
        date.put("Kisi",new Cat("Kisi"));
        date.put("Alla",new Cat("Alla"));
        date.put("Walja",new Cat("Walja"));
        date.put("Wal",new Cat("Wal"));
        date.put("Blja",new Cat("Blja"));
        date.put("Kalja",new Cat("Kalja"));
       return date;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        Set<Cat> names = new HashSet<Cat>();
        for (Map.Entry<String,Cat> pair: map.entrySet()){
            names.add(pair.getValue());

    }
        return names;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
