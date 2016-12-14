package com.javarush.test.level19.lesson08.task04;

/* Решаем пример
В методе main подмените объект System.out написанной вами ридер-оберткой по аналогии с лекцией
Ваша ридер-обертка должна выводить на консоль решенный пример
Вызовите готовый метод printSomething(), воспользуйтесь testString
Верните переменной System.out первоначальный поток

Возможные операции: + - *
Шаблон входных данных и вывода: a [знак] b = c
Отрицательных и дробных чисел, унарных операторов - нет.

Пример вывода:
3 + 6 = 9
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();



    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        testString.printSomething();
        System.setOut(consoleStream);

        String s = outputStream.toString();



        String [] mas = s.split(" ");
        int first = Integer.parseInt(mas[0]);
        int second = Integer.parseInt(mas[2]);
        int res=0;
        if(mas[1].equals("+")){
         res = first+second;}
        else if(mas[1].equals("-")){
            res = first-second;}
        else if(mas[1].equals("*")){
            res = first*second;}

        System.out.print(first+" " + mas[1]+" "+second+" = "+res);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

