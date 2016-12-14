package com.javarush.test.level18.lesson10.home06;

/* Встречаемость символов
Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете). Пример: ','=44, 's'=115, 't'=116
Вывести на консоль отсортированный результат:
[символ1]  частота1
[символ2]  частота2
Закрыть потоки. Не использовать try-with-resources

Пример вывода:
, 19
- 7
f 361
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {


    if(args.length>0){
        Map <Character,Integer> tm = new TreeMap<Character,Integer>();

        FileInputStream inputStream = new FileInputStream(args[0]);
        byte[] buffer = new byte[inputStream.available()];
        char[] ch = new char[0];
            while (inputStream.available()>0){
                inputStream.read(buffer);
                ch = new String(buffer).toCharArray();
            }

            inputStream.close();

        for(char b:ch){
        if(tm.containsKey(b)){
            int val = tm.get(b)+1;
            tm.put(b,val);
        } else {tm.put(b,1);}
         }

        for(Map.Entry<Character,Integer> entry: tm.entrySet()){
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }
    }

    }
}
