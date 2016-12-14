package com.javarush.test.level19.lesson10.home03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* Хуан Хуанович
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя день месяц год
где [имя] - может состоять из нескольких слов, разделенных пробелами, и имеет тип String
[день] - int, [месяц] - int, [год] - int
данные разделены пробелами

Заполнить список PEOPLE импользуя данные из файла
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Иванов Иван Иванович 31 12 1987
Вася 15 5 2013
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException{

        BufferedReader in = new BufferedReader(new FileReader(args[0]));

        String [] words;
        String s;

            while((s=in.readLine())!=null)
            {
                words = s.split(" ");


                int day = Integer.parseInt(words[words.length - 3]);
                int mounth = Integer.parseInt(words[words.length - 2]) - 1;
                int year = Integer.parseInt(words[words.length - 1]);

                Date birthday = new GregorianCalendar(year, mounth, day).getTime();


                String name = "";
                for (int i = 0; i <= words.length - 4; i++)
                {
                    if (i == words.length-4)
                    name = name+words[i];
                    else {
                        name = name+words[i]+" ";

                    }
                }

                PEOPLE.add(new Person(name, birthday));
            }
        in.close();
    }

}
