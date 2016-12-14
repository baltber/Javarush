package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        ArrayList<String>[]strings = new ArrayList[5];
        ArrayList<String>list1 = new ArrayList<String>();
        ArrayList<String>list2 = new ArrayList<String>();
        ArrayList<String>list3 = new ArrayList<String>();
        ArrayList<String>list4 = new ArrayList<String>();
        ArrayList<String>list5 = new ArrayList<String>();

        list1.add("dsd");
        list2.add("dsd");
        list3.add("dsd");
        list4.add("dsd");
        list5.add("dsd");
        strings[0] = list1;
        strings[1] = list2;
        strings[2] = list3;
        strings[3] = list4;
        strings[4] = list5;


        //напишите тут ваш код

        return strings;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}