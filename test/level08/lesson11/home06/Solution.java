package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        Human son1 = new Human("Алексей", true, 10, new ArrayList<Human>());
        Human son2 = new Human("Иван", true, 10, new ArrayList<Human>());
        Human do1 = new Human("Инна", false, 10, new ArrayList<Human>());
        ArrayList<Human> kids = new ArrayList<Human>();
        kids.add(son1);
        kids.add(son2);
        kids.add(do1);

        Human f = new Human("Виктор", true, 30, kids);
        Human m = new Human("Катя", false, 79, kids);
        ArrayList<Human> par1 = new ArrayList<Human>();
        par1.add(f);
        ArrayList<Human> par2 = new ArrayList<Human>();
        par2.add(m);

        Human gf1 = new Human("Михаил", true, 89, par1);
        Human gf2 = new Human("Алексей", true, 79, par2);
        Human gm1 = new Human("Анна", false, 89, par1);
        Human gm2 = new Human("Евгения", false, 79, par2);

        System.out.println(gf1.toString());
        System.out.println(gf2.toString());
        System.out.println(gm1.toString());
        System.out.println(gm2.toString());
        System.out.println(f.toString());
        System.out.println(m.toString());
        System.out.println(son1.toString());
        System.out.println(son2.toString());
        System.out.println(do1.toString());
        //напишите тут ваш код
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }



    public String toString()
    {
        String text = "";
        text += "Имя: " + this.name;
        text += ", пол: " + (this.sex ? "мужской" : "женский");
        text += ", возраст: " + this.age;

        int childCount = this.children.size();
        if (childCount > 0)
        {
            text += ", дети: " + this.children.get(0).name;

            for (int i = 1; i < childCount; i++)
            {
                Human child = this.children.get(i);
                text += ", " + child.name;
            }
        }

        return text;
    }
}
}


