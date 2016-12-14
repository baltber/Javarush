package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
      Human grandfather1 = new Human("Александр", 77, true, null, null);
      Human grandfather2 = new Human("Пётр", 78, true, null, null);
      Human grandmother1 = new Human("Таисия", 65, false, null, null);
      Human grandmother2 = new Human("Томара", 68, false, null, null);
      Human father = new Human("Анатолий", 39, true, grandfather1, grandmother1);
        Human mother = new Human("Ирина", 34, false, grandfather2, grandmother2);
        Human ch1 = new Human("Сергей", 13, true, father, mother);
        Human ch2 = new Human("Вера", 15, false, father, mother);
        Human ch3 = new Human("Михаил", 11, true, father, mother);

        System.out.println(grandfather1);
        System.out.println(grandfather2);
        System.out.println(grandmother1);
        System.out.println(grandmother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
        //напишите тут ваш код
    }

    public static class Human
    {
        Human father, mother;
        String name; //напишите тут ваш код
        int age;
        boolean sex;
            public Human (String name, int age, boolean sex, Human father, Human mother){
                this.name = name;
                this.age = age;
                this.sex = sex;
                this.father = father;
                this.mother = mother;
}
        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)

                text += ", отец: " + this.father.name;
                if (this.mother != null)
                    text += ", мать: " + this.mother.name;

            return text;

        }


    }

}
