package com.javarush.test.level18.lesson03.task05;

import com.javarush.test.level15.lesson12.home03.Tree;

import javax.swing.table.TableRowSorter;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;




/* Сортировка байт
Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода

Пример байт входного файла
44 83 44

Пример вывода
44 83
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        TreeSet<Integer> ts = new TreeSet<Integer>();

        while(inputStream.available()>0){
            int data = inputStream.read();
            ts.add(data);
        }
        inputStream.close();

        Iterator iter = ts.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }

    }
}
