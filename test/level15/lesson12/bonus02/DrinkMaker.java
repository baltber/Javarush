package com.javarush.test.level15.lesson12.bonus02;

/**
 * Created by Сергей on 28.05.2016.
 */
abstract public class DrinkMaker
{
    abstract void getRightCup();
    abstract void putIngredient();
    abstract void pour();
    void makeDrink(){
        getRightCup();
        putIngredient();
        pour();

    }
}
