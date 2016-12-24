package com.javarush.test.level22.lesson09.task01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* Обращенные слова
В методе main с консоли считать имя файла, который содержит слова, разделенные пробелами.
Найти в тексте все пары слов, которые являются обращением друг друга. Добавить их в result.
Порядок слов first/second не влияет на тестирование.
Использовать StringBuilder.
Пример содержимого файла
рот тор торт о
о тот тот тот
Вывод:
рот тор
о о
тот тот
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new FileReader(sc.nextLine()));
        List <String> list = new ArrayList<>();

        while (reader.ready()){
          list.addAll(Arrays.asList(reader.readLine().split(" ")));

        }
        reader.close();
        sc.close();
        for(int i = 0; i<list.size(); i++) {
            for(int j = 0; j<list.size(); j++){
                if(list.get(i).equals(new StringBuilder(list.get(j)).reverse().toString())&&j!=i){
                    Pair pair = new Pair();
                    pair.first = list.get(i);
                    pair.second = list.get(j);
                    result.add(pair);
                    list.remove(j);
                    list.remove(i);
                    j = 0;
                }
                else
                    j++;
            }
        }

    }

    public static class Pair {
        String first;
        String second;

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                    second == null && first != null ? first :
                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
