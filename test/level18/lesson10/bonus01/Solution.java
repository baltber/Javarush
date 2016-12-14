package com.javarush.test.level18.lesson10.bonus01;

/* Шифровка
Придумать механизм шифровки/дешифровки

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName
где
fileName - имя файла, который необходимо зашифровать/расшифровать
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования
-e - ключ указывает, что необходимо зашифровать данные
-d - ключ указывает, что необходимо расшифровать данные
*/

import java.io.FileInputStream;

import java.io.FileOutputStream;


public class Solution {
    public static void main(String[] args) throws Exception {
        String com = args[0];

        FileInputStream inputStream = new FileInputStream(args[1]);
        FileOutputStream fileOutputStream = new FileOutputStream(args[2]);

        switch (com){
            case "-e":
                while (inputStream.available()>0){
                    int data = inputStream.read();
                    int res = data+5;
                    fileOutputStream.write(res);
                }
                break;
            case "-d":
                while (inputStream.available()>0){
                    int data = inputStream.read();
                    int res = data-5;
                    fileOutputStream.write(res);
                }
        }
        inputStream.close();
        fileOutputStream.close();
    }

}
