package questone.fourthlevel.lecture6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DifferentNumber {
    public static void main(String[] args) throws Exception{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[3];

        for (int i = 0; i < 3; i++) {
            String sA = reader.readLine();
            int a = Integer.parseInt(sA);
            array[i] = a;
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i+1]){
                System.out.println(i+1);
            }
        }


    }
}
