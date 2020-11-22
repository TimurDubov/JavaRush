package questone.seventhlevel.lecture4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ALotOfArrays {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] aBigOne = new int[20];
        int[] aSmallOne1 = new int[10];
        int[] aSmallOne2 = new int[10];

        for (int i = 0; i < aBigOne.length; i++) {
            aBigOne[i] = Integer.parseInt(reader.readLine());
            if (i < 10){
                aSmallOne1[i] = aBigOne[i];
            } else aSmallOne2[i - 10] = aBigOne[i];

        }

        for (int i = 0; i < aSmallOne2.length; i++) {
            System.out.println(aSmallOne2[i]);
        }

    }
}
