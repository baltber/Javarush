package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
       Set<String> set = new HashSet<String>(); //напишите тут ваш код
        set.add("Лодка");
        set.add("Любовь");
        set.add("Ломантин");
        set.add("Лего");
        set.add("Люцифер");
        set.add("Лань");
        set.add("Логово");
        set.add("Люберцы");
        set.add("Лупита");
        set.add("Люлька");
        set.add("Лень");
        set.add("Лебовски");
        set.add("Лошара");
        set.add("Лесть");
        set.add("ЛЯЛЯЛЯ");
        set.add("Лоротадин");
        set.add("Лясы");
        set.add("Личность");
        set.add("Лэптоп");
        set.add("Локи");

        return (HashSet)set;
    }
}
