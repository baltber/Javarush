package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();
        System.out.println(getCountTheSameFirstName(map, "Sergey"));
        System.out.println(getCountTheSameLastName(map, "Taylakov"));
    }
    public static HashMap<String, String> createMap()
    {
       Map<String, String> map = new HashMap<String, String>();
        map.put("Taylakov", "Sergey");
        map.put("Golod", "Andrey");
        map.put("Petrov", "Michail");
        map.put("Evgeniy", "Kruglov");
        map.put("Roman", "Ivanov");
        map.put("Timophey", "Sidorov");
        map.put("Oleg", "Michailov");
        map.put("Semen", "Nikolaev");
        map.put("Fedor", "Kolesnikov");
        map.put("Matvey", "Gsvrichkin");
        return (HashMap) map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {

        int b = 0;
        for (Map.Entry<String, String> pair : map.entrySet()){
            String value = pair.getValue();
            if (value.equals(name)){
                ++b;}

            //напишите тут ваш код
        }
        return b;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int a = 0;
        for (Map.Entry<String, String> pair : map.entrySet()){
            String key = pair.getKey();
            if (key.equals(lastName)){
                ++a;}

            //напишите тут ваш код
        }
        return a;
//напишите тут ваш код

    }
}
