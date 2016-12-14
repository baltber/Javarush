package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream outputStream1 = new FileOutputStream(reader.readLine());
        FileOutputStream outputStream2 = new FileOutputStream(reader.readLine());

        byte[] buffer = new byte[inputStream.available()];

        if (inputStream.available()>0){
            inputStream.read(buffer);

        }

        byte[] buffer2;
        byte[] buffer3 = new byte[buffer.length/2];

        if(buffer.length%2==0){
            buffer2=new byte[buffer.length/2];
            System.arraycopy(buffer,0,buffer2,0,buffer.length/2);
            System.arraycopy(buffer,buffer.length/2,buffer3,0,buffer.length/2);
        }
        else
        {
            buffer2=new byte[buffer.length/2+1];
            System.arraycopy(buffer,0,buffer2,0,buffer2.length);
            for (int i = buffer.length/2+1; i<buffer.length; i++)
                buffer3[i-buffer.length/2-1] = buffer[i];
        }
        outputStream1.write(buffer2);
        outputStream2.write(buffer3);


          reader.close();
        inputStream.close();
            outputStream1.close();
            outputStream2.close();
        }
    }

