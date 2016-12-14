package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream outputStream = new FileOutputStream(reader.readLine());
        ArrayList<Integer> list = new ArrayList<Integer>();

        while (inputStream.available()>0){
            int data = inputStream.read();
            list.add(data);
        }
        for(int i = list.size()-1; i>-1; i--){
            outputStream.write(list.get(i));
        }
        reader.close();
        inputStream.close();
        outputStream.close();
    }
}
