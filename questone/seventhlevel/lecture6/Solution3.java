package questone.seventhlevel.lecture6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution3 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++)
        {
            strings.add(i, reader.readLine());
        }

        int max = 0;
        int min = strings.get(0).length();
        int indexMax = 0;
        int indexMin = 0;

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() > max)
            {
                max = strings.get(i).length();
                indexMax = i;
            }

            if (strings.get(i).length() < min)
            {
                min = strings.get(i).length();
                indexMin = i;
            }
        }

        if (indexMin < indexMax)
        {
            System.out.println(strings.get(indexMin));
        }
        if (indexMax < indexMin)
        {
            System.out.println(strings.get(indexMax));
        }

    }
}