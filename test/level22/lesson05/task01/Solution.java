package com.javarush.test.level22.lesson05.task01;

/* Найти подстроку
Метод getPartOfString должен возвращать подстроку начиная с символа после 1-го пробела и до конца слова,
которое следует после 4-го пробела.
Пример: "JavaRush - лучший сервис обучения Java."
Результат: "- лучший сервис обучения"
На некорректные данные бросить исключение TooShortStringException (сделать исключением).
Сигнатуру метода getPartOfString не менять.
Метод main не участвует в тестировании.
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        String [] spl = string.split(" ");
        if(spl.length<5){
           throw new TooShortStringException();
        } else{
        String s = spl[1]+" "+spl[2]+" "+spl[3]+" "+spl[4];
            return s;
        }

    }

    public static class TooShortStringException extends Exception{
    }
    public static void main (String[] args) throws TooShortStringException
    {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }
}
