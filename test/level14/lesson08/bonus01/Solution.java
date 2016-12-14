package com.javarush.test.level14.lesson08.bonus01;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequencer;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        }
        catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            int[] ar = new int[5];
            ar[6] = ar[1];
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            int[] a = new int[-1];
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            Object ob = new String("d");
            System.out.println((String) ob);
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            new Exception();
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }
        //Add your code here
        try
        {
            Sequencer sequencer = MidiSystem.getSequencer();
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            FileInputStream inputFile = new FileInputStream("d.txt");
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }


        try
        {
            throw new IndexOutOfBoundsException();

        }
        catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            throw new EmptyStackException();

        }
        catch (Exception e)
        {
            exceptions.add(e);
        }


        try
        {
            throw new Exception();

        }
        catch (Exception e)
        {
            exceptions.add(e);
        }


        try
        {
            String s = "cc";
            int i = Integer.parseInt(s);
            System.out.println("int value = " + i);
        }
        catch (Exception e)
        {
            exceptions.add(e);

        }

    try
    {
        String szShortString = "123";
        char chr = szShortString.charAt(10);
    }
    catch (Exception e)
    {
        exceptions.add(e);
    }

}}
