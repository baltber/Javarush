package com.javarush.test.level15.lesson12.bonus02;

/**
 * Created by Сергей on 28.05.2016.
 */
public class LatteMaker extends DrinkMaker
{
     void getRightCup(){
         System.out.println("Берем чашку для латте");
     }
     void putIngredient(){
         System.out.println("Делаем кофе");
     }
     void pour(){
         System.out.println( "Заливаем молоком с пенкой");

     }
    void makeDrink(){
super.makeDrink();
    }

}
