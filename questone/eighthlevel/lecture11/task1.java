package questone.eighthlevel.lecture11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstLetterIsAreCapital {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        String[] words = string.split(" +");
        String finalString = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() != 0) {

                finalString = finalString + words[i].substring(0, 1).toUpperCase() + words[i].substring(1) + " ";
            }
        }

        System.out.println(finalString);
        //напишите тут ваш код
    }
}

