package com.javarush.test.level07.lesson09.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Удвой слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведи результат на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();//read strings and init ArrayList list here - считать строки с консоли и объявить ArrayList list тут
        for (int i = 0; i<10;i++){
            String s = bis.readLine();
            list.add(s);
        }

        ArrayList<String> result = doubleValues(list);
for(String s: result){
    System.out.println(s);
}
        //print result - вывести на экран result
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
       for (int i=0; i<list.size(); ){
           list.add(i+1, list.get(i));
           i+=2;// add your code here - добавь код тут
       }
        return list;
    }
}
