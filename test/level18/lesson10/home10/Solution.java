package com.javarush.test.level18.lesson10.home10;

/* Собираем файл
Собираем файл из кусочков
Считывать с консоли имена файлов
Каждый файл имеет имя: [someName].partN. Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.
Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end"
В папке, где находятся все прочтенные файлы, создать файл без приставки [.partN]. Например, Lion.avi
В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть потоки. Не использовать try-with-resources
*/


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) throws IOException{
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<byte []> listbuf = new ArrayList <byte []> ();
        Scanner sc = new Scanner(System.in);

        String fileName1="";
        File file2 = null;


        while (!(fileName1 = sc.nextLine()).equals("end")){

            list.add(fileName1);
            String fileName2 = fileName1.replaceFirst("\\.part.","");
             file2 = new File(fileName2);
            file2.createNewFile();
        }

             sc.close();
            Collections.sort(list);

            for(int i=0; i<list.size(); i++){
                FileInputStream in =  new FileInputStream(list.get(i));

                byte[] buf = new byte[in.available()];
                in.read(buf);

                listbuf.add(buf);
                in.close();
            }

                FileOutputStream outputStream = new FileOutputStream(file2);
                for(int i=0; i<listbuf.size(); i++)
                {
                    outputStream.write(listbuf.get(i));
                }
                    outputStream.close();

    }
}
