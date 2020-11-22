package questtwo.sixthlevel.lecture13.factorymethodpattern;

import questtwo.sixthlevel.lecture13.factorymethodpattern.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes imageType){

        if (imageType == ImageTypes.JPG){
            return new JpgReader();
        } else if (imageType == ImageTypes.BMP){
            return new BmpReader();
        } else if (imageType == ImageTypes.PNG){
            return new PngReader();
        } else throw new IllegalArgumentException("Неизвестный тип картинки");

    }
}
