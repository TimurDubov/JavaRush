package questone.seventhlevel.lecture4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MakingTwoArrays {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] strings = new String[10];
        int[] ints = new int[10];

        for (int i = 0; i < 10; i++) {
            strings[i] = reader.readLine();
        }
        for (int i = 0; i < strings.length; i++) {
            ints[i] = strings[i].length();
            System.out.println(ints[i]);
        }

    }
}
