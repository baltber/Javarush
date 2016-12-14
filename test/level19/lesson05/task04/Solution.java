package com.javarush.test.level19.lesson05.task04;

/* Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Заменить все точки "." на знак "!", вывести во второй файл.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(reader.readLine());
        FileWriter fileWriter = new FileWriter(reader.readLine());
        reader.close();
        ArrayList<Character> list = new ArrayList<Character>();
        while(fileReader.ready()){
           int data = fileReader.read();
            list.add((char)data);
        }
        fileReader.close();
        for(int i=0; i<list.size();i++){

           if(list.get(i)=='.'){
               list.set(i, '!');
            }
        }
        for (char c:list){
            fileWriter.write(c);
        }

        fileWriter.close();
    }
}
