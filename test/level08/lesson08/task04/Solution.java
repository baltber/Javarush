package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap<String, Date> map1 = createMap();
        removeAllSummerPeople(map1);
        System.out.println(map1);

    }
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Lenin", new Date("JUNE 1 1980"));
        map.put("Andropov", new Date("SEPTEMBER 1 1980"));
        map.put("Stalin", new Date("OCTOBER 1 1980"));
        map.put("Bregnev", new Date("AUGUST 1 1980"));
        map.put("Uchenko", new Date("JULY 1 1980"));
        map.put("Putin", new Date("MAY 1 1980"));
        map.put("Gref", new Date("APRIL 1 1980"));
        map.put("Chruchev", new Date("DECEMBER 1 1980"));
        map.put("Gusev", new Date("JANUARY 1 1980"));
        map.put("Seleznev", new Date("FEBRUARY 1 1980"));
        //напишите тут ваш код
return (HashMap) map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {

        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            int month = iterator.next().getValue().getMonth() + 1;
            if (6 <= month && month <= 8)
            {
                iterator.remove();
            }
            //напишите тут ваш код
        }
          //напишите тут ваш код

    }
}
