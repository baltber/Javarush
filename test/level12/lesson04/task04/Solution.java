package com.javarush.test.level12.lesson04.task04;

/* Три метода возвращают минимальное из двух переданных в него чисел
Написать public static методы: int min(int, int), long min(long, long), double min(double, double).
Каждый метод должен возвращать минимальное из двух переданных в него чисел.
*/

public class Solution
{
    public static void main(String[] args)
    {
min(5,6);

    }

   public static int min(int n, int n1){
       int mini;
       if (n<n1){
           mini = n;
       }
       else mini = n1;
       return mini;
   }
    public static long min(long n, long n1){
        long mini;
        if (n<n1){
            mini = n;
        }
        else mini = n1;
        return mini;
    }
    public static double min(double n, double n1){
        double mini;
        if (n<n1){
            mini = n;
        }
        else mini = n1;
        return mini;
    }//Напишите тут ваши методы
}
