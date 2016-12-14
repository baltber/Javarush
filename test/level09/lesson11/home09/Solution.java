package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
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
        Map<String, Cat> map = new HashMap<String, Cat>();
        map.put("murzik", new Cat("kot"));
        map.put("barsik", new Cat("kot"));
        map.put("vaska", new Cat("kot"));
        map.put("hrushk", new Cat("kot"));
        map.put("muzhik", new Cat("kot"));
        map.put("evgeniy", new Cat("kot"));
        map.put("zaratustra", new Cat("kot"));
        map.put("semen", new Cat("kot"));
        map.put("sergey", new Cat("kot"));
        map.put("malush", new Cat("kot"));
        return map;
        //напишите тут ваш код
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        Set<Cat>set = new HashSet<Cat>();
        for (Map.Entry<String, Cat> pair : map.entrySet()){
            Cat value = pair.getValue();

            set.add(value);
        }
        return (HashSet) set;
        //напишите тут ваш код
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
