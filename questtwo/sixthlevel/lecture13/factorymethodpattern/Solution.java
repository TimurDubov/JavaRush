package questtwo.sixthlevel.lecture13.factorymethodpattern;

import questtwo.sixthlevel.lecture13.factorymethodpattern.common.ImageReader;
import questtwo.sixthlevel.lecture13.factorymethodpattern.common.ImageTypes;

public class Solution {
    public static void main(String[] args) {
        ImageReader reader = ImageReaderFactory.getImageReader(ImageTypes.JPG);
    }
}
