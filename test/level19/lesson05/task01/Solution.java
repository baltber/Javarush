package com.javarush.test.level19.lesson05.task01;

/* Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
Закрыть потоки ввода-вывода.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(reader.readLine());
        FileWriter fileWriter = new FileWriter(reader.readLine());
        char[] buf = new char[fileReader.read()];
        if(fileReader.ready()){
            fileReader.read(buf);
            for (int i =0; i<buf.length; i+=2){
                fileWriter.write(buf[i]);
            }
        }
        fileReader.close();
        fileWriter.close();
    }
}
