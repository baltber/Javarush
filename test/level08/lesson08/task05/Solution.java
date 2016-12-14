package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap <String, String> map = createMap();
        removeTheFirstNameDuplicates(map);


    }
    public static HashMap<String, String> createMap()
    {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Taylakov", "Sergey");
        map.put("Golod", "Andrey");
        map.put("Petrov", "Michail");
        map.put("Kruglov", "Evgeniy");
        map.put("Ivanov", "Sergey");
        map.put("Timophey", "Sidorov");
        map.put("Oleg", "Michailov");
        map.put("Semen", "Nikolaev");
        map.put("Fedor", "Kolesnikov");
        map.put("Matvey", "Gsvrichkin");
        return (HashMap) map; //напишите тут ваш код

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String, String> copy2 = new HashMap<String, String>(map);
        HashMap<String, String> copy3 = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy2.entrySet())
        {
            copy3.remove(pair.getKey());
            if (copy3.containsValue(pair.getValue()))
            {
                removeItemFromMapByValue(map, pair.getValue());
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {

        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
