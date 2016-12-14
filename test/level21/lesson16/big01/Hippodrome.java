package com.javarush.test.level21.lesson16.big01;

import java.util.ArrayList;

/**
 * Created by ser12 on 10.12.16.
 */
public class Hippodrome
{
    public static Hippodrome game;
    ArrayList<Horse> horses = new ArrayList<>();
    public ArrayList<Horse> getHorses()
    {
        return horses;
    }
    public static void main(String[] args) throws InterruptedException
    {
        game =new Hippodrome();
        game.getHorses().add(new Horse("Murka", 3,0));
        game.getHorses().add(new Horse("Vaska", 3,0));
        game.getHorses().add(new Horse("Glasha", 3,0));
        game.run();

        game.printWinner();
    }
    public void move(){
        for (Horse horse : horses)
            horse.move();

    }
    public void run()throws InterruptedException{
        for(int i=0; i<100; i++){
            move();
            print();
            Thread.sleep(200);
        }

    }

    public void print(){
        for(Horse horse: horses){
            horse.print();
        }
        System.out.println();
        System.out.println();

    }
    public Horse getWinner(){
        Horse winner = horses.get(0);
        for(Horse horse: horses){
            if(horse.getDistance()>winner.getDistance()){
                winner=horse;
            }
        }
        return winner;
    }
    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName()+"!");
    }
}
