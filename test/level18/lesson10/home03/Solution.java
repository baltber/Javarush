package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream outputStream1 = new FileOutputStream(reader.readLine());
        FileInputStream inputStream = new FileInputStream(reader.readLine());

        FileInputStream inputStream2 = new FileInputStream(reader.readLine());

        byte[] buffer = new byte[inputStream.available()];

        if (inputStream.available()>0){
            inputStream.read(buffer);

        }


        outputStream1.write(buffer);
        byte[] buffer3 = new byte[inputStream2.available()];
        if (inputStream2.available()>0){
            inputStream2.read(buffer3);

        }
        reader.close();
        outputStream1.write(buffer3);
        inputStream.close();
        inputStream2.close();
        outputStream1.close();
    }
}
