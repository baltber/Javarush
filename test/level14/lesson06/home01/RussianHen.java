package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Сергей on 26.03.2016.
 */
public class RussianHen extends Hen
{
    @Override
  public int getCountOfEggsPerMonth(){
        return 5;
    }
    @Override
   public String getDescription()
    {
        return super.getDescription()+" Моя страна - "+ Country.RUSSIA+". Я несу " +getCountOfEggsPerMonth()+ " яиц в месяц.";
    }
}
