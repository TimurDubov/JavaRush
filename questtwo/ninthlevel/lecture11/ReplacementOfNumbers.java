package questtwo.ninthlevel.lecture11;

import javax.crypto.spec.PSource;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class ReplacementOfNumbers {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }


    public static void main(String[] args) throws IOException {


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String filePath = bufferedReader.readLine();

        bufferedReader.close();

        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(filePath));


        StringBuilder stringBuilder = new StringBuilder();


        while (bufferedReader1.ready()) {
            stringBuilder.append(bufferedReader1.readLine());
            stringBuilder.append('\n');
        }

        bufferedReader1.close();
        String s = stringBuilder.toString();


        for (int i = 12; i >= 0; i--) {
            s = s.replaceAll("\\b(" + i + ")\\b", map.get(i));
        }

        System.out.println(s);

    }


}

