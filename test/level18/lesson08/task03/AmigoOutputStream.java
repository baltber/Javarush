package com.javarush.test.level18.lesson08.task03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* AmigoOutputStream
1 Измените класс AmigoOutputStream так, чтобы он стал Wrapper-ом для класса FileOutputStream. Используйте наследование.
2 При вызове метода close() должны выполняться следующая последовательность действий:
2.1 вызвать метод flush()
2.2 дописать следующий текст [JavaRush © 2012-2013 All rights reserved.], используйте метод getBytes()
2.3 закрыть поток методом close()
*/

public class AmigoOutputStream extends FileOutputStream{
     private FileOutputStream component;

    public static String fileName = "C:/tmp/result.txt";

    public AmigoOutputStream (FileOutputStream component) throws FileNotFoundException{
        super(fileName);
        this.component = component;}

    @Override
    public void close() throws IOException
    {
        super.flush();
        component.write("JavaRush © 2012-2013 All rights reserved.".getBytes());
        component.close();
    }
    @Override
    public void write(byte[] b, int off, int len) throws IOException
    {
        component.write(b, off, len);
    }

    @Override
    public void write(byte[] b) throws IOException
    {
        component.write(b);
    }

    @Override
    protected void finalize() throws IOException
    {
        super.finalize();
    }


    @Override
    public void write(int b) throws IOException
    {
        component.write(b);

    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}

