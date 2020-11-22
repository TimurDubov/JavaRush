package questtwo.eighthlevel.lecture11;

import java.io.FileInputStream;
import java.io.IOException;

public class Spaces {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(args[0]);


        double amountOfSpaces = 0;
        double totalCharactersInTheText = 0;

        while (fileInputStream.available() > 0){
            totalCharactersInTheText++;
            if (fileInputStream.read() == 32){
                amountOfSpaces++;
            }
        }
        countingSpaces(amountOfSpaces, totalCharactersInTheText);

        fileInputStream.close();

    }

    public static void countingSpaces(double amountOfSpaces, double totalCharactersInTheText){

        double percentOfSpacesInTheText = (amountOfSpaces / totalCharactersInTheText) * 100;

        String result = String.format("%.2f", percentOfSpacesInTheText);

        System.out.printf("%.2f" );
    }
}
