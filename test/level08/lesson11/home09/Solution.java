package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        isDateOdd(" MAY 1 2020");
    }

    public static boolean isDateOdd(String date)
    {
        Date yearStartTime = new Date();
        yearStartTime.setMonth(0);
        yearStartTime.setDate(1);

        Date currentTime = new Date(date);
        long msTimeDistance = currentTime.getTime() - yearStartTime.getTime();
        long msDay = 24*60*60*1000;
        int dauCount = (int)(msTimeDistance/msDay);
        if (dauCount%2 ==0){
            return false;
        }


        return true;
    }
}
