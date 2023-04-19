package com.nagra;


import org.alcibiade.asciiart.coord.TextBoxSize;
import org.alcibiade.asciiart.image.rasterize.ShapeRasterizer;
import org.alcibiade.asciiart.raster.ExtensibleCharacterRaster;
import org.alcibiade.asciiart.raster.Raster;
import org.alcibiade.asciiart.raster.RasterContext;
import org.alcibiade.asciiart.widget.PictureWidget;
import org.alcibiade.asciiart.widget.TextWidget;

import javax.imageio.IIOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("Hello world!, This is Athar. Nice to meet You");
        try {
            File image = new File("cartman.jpeg");
            BufferedImage circleImage = ImageIO.read(image);


            TextWidget widget = new PictureWidget(new TextBoxSize(80, 30),
                    circleImage, new ShapeRasterizer());
            Raster raster = new ExtensibleCharacterRaster();

            widget.render(new RasterContext(raster));
            System.out.println(raster);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}