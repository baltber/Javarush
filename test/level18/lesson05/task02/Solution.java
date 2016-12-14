package com.javarush.test.level18.lesson05.task02;

/* Подсчет запятых
С консоли считать имя файла
Посчитать в файле количество символов ',', количество вывести на консоль
Закрыть потоки. Не использовать try-with-resources

Подсказка: нужно сравнивать с ascii-кодом символа ','
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        ArrayList<Integer> list = new ArrayList<Integer>();

        while (inputStream.available()>0){
            int data = inputStream.read();
            list.add(data);
        }

        int count=0;
        for(int i=0; i<list.size(); i++){

            if(list.get(i)==44){
                count++;
            }
        }
        inputStream.close();
        reader.close();

        System.out.print(count);

    }
}
