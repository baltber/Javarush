package com.javarush.test.level19.lesson03.task04;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* И еще один адаптер
Адаптировать Scanner к PersonScanner.
Классом-адаптером является PersonScannerAdapter.
Данные в файле хранятся в следующем виде:
Иванов Иван Иванович 31 12 1950

В файле хранится большое количество людей, данные одного человека находятся в одной строке. Метод read() должен читать данные одного человека.
*/

public class Solution {
    public static class PersonScannerAdapter implements PersonScanner {
        Scanner scanner;
        PersonScannerAdapter(Scanner scanner){
            this.scanner = scanner;
        }

        @Override
        public Person read() throws IOException
        {
            String line = scanner.nextLine();
            String [] s = line.split(" ");
            String lastName = s[0];
            String firstName = s[1];
            String middleName = s[2];

            int day = Integer.parseInt(s[3]);
            int month = Integer.parseInt(s[4])-1;
            int year = Integer.parseInt(s[5]);

            Calendar calendar = new GregorianCalendar(year,month,day);
            return new Person(firstName,middleName, lastName,calendar.getTime());


        }

        @Override
        public void close() throws IOException
        {
             scanner.close();
        }
    }
}
