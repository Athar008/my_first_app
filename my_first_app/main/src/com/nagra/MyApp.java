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
import java.io.InputStream;

public class MyApp {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!, This is Athar. Nice to meet You. kk");
        BufferedImage flowerImage = null;
        ClassLoader classLoader = MyApp.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("cartman1.jpeg");
           // File image = new File("src/main/resources/cartman1.jpeg");
            try {
                BufferedImage image = ImageIO.read(resourceAsStream);


                TextWidget widget = new PictureWidget(new TextBoxSize(80, 30),
                        image, new ShapeRasterizer());
                Raster raster = new ExtensibleCharacterRaster();

                widget.render(new RasterContext(raster));
                System.out.println(raster.toString());
            } catch (IOException e){
                e.printStackTrace();
            }



    }
}