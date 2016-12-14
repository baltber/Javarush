package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int index = s.indexOf("?") + 1;
        String sub = s.substring(index);
        ArrayList<String> key = new ArrayList<String>();
        ArrayList<String> value = new ArrayList<String>();
        Pattern p1 = Pattern.compile("&");
        String[] param = p1.split(sub);
        for (String h : param)
        {
            if (h.contains("="))
            {
                String[] p2 = h.split("=");
                String val = p2[0];
                key.add(val);
                if (val.equals("obj") )
                {

                    value.add(p2[1]);
                }
            } else
            {
                key.add(h);


            }
        }
        for (int i = 0; i < key.size(); i++)
        {
            System.out.print(key.get(i) + " ");
        } //add your code here

        for (String d : value)
        {
            try
            {
                alert(Double.parseDouble(d));
            }
            catch (Exception e)
            {
                alert(d);
            }
        }

    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
