package com.javarush.test.level00.lesson03.task02;

/* На дворе 31 век
Написать программу, выводящую на экран нынешний год. На дворе 31 век, если что.

Подсказка:
Возьмите текущий год и измените век на 31.
Вывести нужно число, состоящее из четырех цифр.
*/
public class Solution
{
    public static void main(String[] args)
    {
        int jahr  = 2016;
        jahr += 11;
        System.out.println("На дворе" +jahr+" век, если что");
    }
}
