package questone.eighthlevel.lecture6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TheLongestSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arr = new ArrayList<>();

        int currentResult = 1;
        int endResult = 1;
        for (int i = 0; i < 10; i++) {
            arr.add(Integer.parseInt(reader.readLine()));

        }
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i).equals( arr.get(i + 1)))
                currentResult += 1;
            else
                currentResult = 1;

            if (currentResult > endResult)
                endResult = currentResult;
        }
        System.out.println(endResult);



        //напишите тут ваш код

    }
}