package questtwo.eighthlevel.lecture3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import java.util.ArrayList;

// Рабочая версия без использования коллекций

public class TheMostRareBytes {
    public static void main(String[] args) throws Exception{

        long[] array = new long[256];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(s);

        while (fileInputStream.available() > 0){
            array[fileInputStream.read()]++;
        }

        long minRepeat = Long.MAX_VALUE;
        for (int i = 0; i <array.length; i++) {
            if (array[i]<minRepeat){
                minRepeat = array[i];
            }
        }
        for (int i = 0; i <array.length; i++) {
            if (array[i]==minRepeat) System.out.print(i + " ");
        }

        fileInputStream.close();

    }
}
