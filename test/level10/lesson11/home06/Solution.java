package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
       /* Human ch1 = new Human("Ivan", "Ivanov", "men", 15, null, new ArrayList<Human>());
        Human ch2 = new Human("Olga", "Ivanova", "woman", 12, null, new ArrayList<Human>());
        Human ch3 = new Human("Andrey", "Ivanov", "men", 10, null, new ArrayList<Human>());
        Human ch4 = new Human("Inna", "Ivanova", "woman", 8, null, new ArrayList<Human>());
        ArrayList<Human> kids1 = new ArrayList<Human>();
        kids1.add(ch1);
        kids1.add(ch2);
        kids1.add(ch3);
        kids1.add(ch4);
        Human f1 = new Human("Semen", "Ivanov", "men", 45, kids1, new ArrayList<Human>());
        Human m1 = new Human("Anna", "Ivanova", "woman", 42, kids1, new ArrayList<Human>());
        ArrayList<Human> par1 = new ArrayList<Human>();
        par1.add(f1);
        par1.add(m1);
        Human gf1 = new Human("Semen", "Ivanov", "men", 75, par1, new ArrayList<Human>());
        Human gm1 = new Human("Anna", "Ivanova", "woman", 72, par1, new ArrayList<Human>());
        ArrayList<Human> par2 = new ArrayList<Human>();
        par2.add(gf1);
        par2.add(gm1);
        */
    }

    public static class Human
    {
      String fName;
      String sName;
      String sex;
      int age;
      ArrayList<Human> children;
      ArrayList<Human> parents;

        public Human(String fName,String sName, String sex, int age,ArrayList<Human> children, ArrayList<Human> parents ){
            this.fName = fName;
            this.sName = sName;
            this.sex = sex;
            this.age = age;
            this.children = children;
            this.parents = parents;
        }

        public Human(String fName)
        {
            this.fName = fName;
        }

        public Human(String sex, ArrayList<Human> parents, ArrayList<Human> children, int age)
        {
            this.sex = sex;
            this.parents = parents;
            this.children = children;
            this.age = age;
        }

        public Human(String sName, String fName)
        {
            this.sName = sName;
            this.fName = fName;
        }

        public Human(String fName, String sName, ArrayList<Human> children, ArrayList<Human> parents)
        {
            this.fName = fName;
            this.sName = sName;
            this.children = children;
            this.parents = parents;
        }

        public Human(String fName, String sex, int age)
        {
            this.fName = fName;
            this.sex = sex;
            this.age = age;
        }

        public Human(String fName, int age)
        {
            this.fName = fName;
            this.age = age;
        }

        public Human(String fName, ArrayList<Human> parents, String sex)
        {
            this.fName = fName;
            this.parents = parents;
            this.sex = sex;
        }

        public Human(ArrayList<Human> parents, ArrayList<Human> children, String sName)
        {
            this.parents = parents;
            this.children = children;
            this.sName = sName;
        }

        public Human(int age, ArrayList<Human> children, ArrayList<Human> parents)
        {
            this.age = age;
            this.children = children;
            this.parents = parents;
        }
        //напишите тут ваши переменные и конструкторы
    }

}
