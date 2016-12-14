package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        File file1 = new File(reader.readLine());
        File file2 = new File(reader.readLine());
        FileInputStream inputStream = new FileInputStream(file1);
        FileInputStream inputStream2 = new FileInputStream(file2);


        byte[] buffer = new byte[inputStream.available()];
        byte[] buffer2 = new byte[inputStream2.available()];

        if (inputStream.available()>0){
            inputStream.read(buffer);
        }

        if (inputStream2.available()>0){
            inputStream2.read(buffer2);
        }
        inputStream.close();
        inputStream2.close();
        FileOutputStream outputStream = new FileOutputStream(file1);
        byte[] rez = new byte[buffer.length+buffer2.length];
        System.arraycopy(buffer2,0,rez,0,buffer2.length);

        System.arraycopy(buffer,0, rez, buffer2.length, buffer.length);

            outputStream.write(rez);


        outputStream.close();
        reader.close();

    }
}
