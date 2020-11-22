package questtwo.eighthlevel.lecture11;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class QuantityOfLetters {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);

        long amountOfLetters = 0;
        while (fileInputStream.available() > 0) {
            int i = fileInputStream.read();
            if ((i >= 97 && i <= 122) || (i >= 65 && i <= 90)) {
                amountOfLetters++;
            }
        }
        System.out.println(amountOfLetters);
    }


}

