package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;

/**
 * Created by Сергей on 19.06.2016.
 */
public class ImageReaderFactory
{
public static ImageReader getReader(ImageTypes ImageTypes){
    ImageReader reader;
    if (ImageTypes == ImageTypes.JPG){
        reader =  new JpgReader();
    }
    else if(ImageTypes == ImageTypes.BMP){
        reader = new BmpReader();
    }
    else if (ImageTypes == ImageTypes.PNG)
    {
        reader = new PngReader();
    }
    else
    {
        throw  new  IllegalArgumentException("Неизвестный тип картинки");
    }
    return reader;
}
}
