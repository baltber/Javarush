package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать через пробел во второй файл
Закрыть потоки. Не использовать try-with-resources
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
-3.49 - -3
-3.50 - -3
-3.51 - -4
*/


import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        File file1 = new File(reader.readLine());
        File file2 = new File(reader.readLine());
        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream = new FileOutputStream(file2);


        while(inputStream.available()>0){
            byte[] data = new byte[inputStream.available()];
            inputStream.read(data);
            outputStream.write(input(data));

           }
        reader.close();
        inputStream.close();





        outputStream.close();
    }
    private static byte[] input(byte[] data){
        StringBuilder builder = new StringBuilder();
        String[] s = new String(data).split(" ");
        byte[] res;
        long[] tmp = new long[s.length];

        for(int i = 0; i < s.length; i++){
            tmp[i] = Math.round(Double.valueOf(s[i]));
        }

        for(long i : tmp){
            builder.append(i);
            builder.append(" ");
        }

        res = builder.toString().getBytes();

        return res;
    }
}
