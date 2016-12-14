package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());

        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> listForOutput = new ArrayList<Integer>();
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();

        while(inputStream.available()>0){
            int data = inputStream.read();
            list.add(data);
        }
        inputStream.close();
        //Проставляем количество повторов
        for(int i=0; i<list.size(); i++){
            int zn = list.get(i);
            if(!hm.containsKey(zn)){
                hm.put(zn, 1);}
            else{
                hm.put(zn, hm.get(zn)+1);
            }
        }
        int minValueInMap=(Collections.min(hm.values()));
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            if(entry.getValue() == minValueInMap){
                listForOutput.add(entry.getKey());
            }

        }
        for(int i=0; i<listForOutput.size(); i++){
            System.out.println(listForOutput.get(i));}

    }

}

