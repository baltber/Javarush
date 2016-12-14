package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by Сергей on 16.04.2016.
 */
public class Singleton
{

        private static Singleton instance =null;
    private Singleton(){}

        static  Singleton getInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }

}
